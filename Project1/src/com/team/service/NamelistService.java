package com.team.service;

import com.team.domain.*;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v1
 * @time: 2023/2/14 10:54
 */


public class NamelistService {
    private Employee[] employees;

    public NamelistService(){
        employees=new Employee[Data.EMPLOYEES.length];

        for(int i=0 ;i<employees.length;i++){
            //获取员工类型
            int type =Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id=Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name=Data.EMPLOYEES[i][2];
            int age=Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary=Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equipment equipment;
            switch(type){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case Data.DESIGNER:
                    equipment = createEquipment(i);
                    employees[i] = new Designer(id, name, age, salary, equipment);
                    break;
                case Data.ARCHITECT:
//                    equipment = createEquipment(i);
//                    employees[i] = new (id, name, age, salary, equipment,bonus);
                    break;
            }
        }


    }
    public Employee[]getAllEmployees(){
        return employees;
    }

    public Employee getEmployees(int id)throws TeamException {
        for(int i=0;i<employees.length;i++){
            if(employees[i].getId()==id){
                return employees[i];
            }

        }
        throw new TeamException("找不到这个员工");
    }

    /**
     *获取指定位置上的index员工
     * @param index
     * @return
     */
    private Equipment createEquipment(int index){
        int type=Integer.parseInt(Data.EQUIPMENTS[index][0]);
        String model=Data.EQUIPMENTS[index][1];
        switch(type){
            case Data.PC:
                String display = Data.EQUIPMENTS[index][2];
                return new PC(model,display);

            case Data.NOTEBOOK:
                double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
                return new NoteBook(model, price);

            case Data.PRINTER:
                return new Printer(model,Data.EQUIPMENTS[index][2]);
        }




        return null;
    }

}
