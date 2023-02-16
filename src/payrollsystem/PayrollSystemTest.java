package payrollsystem;

import birthday.exer.MyDate;

public class PayrollSystemTest {
    public static void main(String[] args) {

      Employee[] emps=  new Employee[3];
      emps[0]=new hourlyEmployee("Ð¡°×",20,new MyDate(2002,5,23),50,60);
      emps[1]=new hourlyEmployee("Ð¡ºÚ",20,new MyDate(2002,5,23),70,89);
      emps[2]=new SalariedEmployee("Ð¡ºì",20,new MyDate(2002,5,23),10000);
      for(int i=0;i< emps.length;i++){
          System.out.println(emps[i].toString());
      }







    }

}
