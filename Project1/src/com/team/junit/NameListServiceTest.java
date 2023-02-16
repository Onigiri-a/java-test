package com.team.junit;

import com.team.domain.Employee;
import com.team.service.NamelistService;
import com.team.service.TeamException;
import org.junit.jupiter.api.Test;

/**
 * @description: NameListServiceµÄ²âÊÔ
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/14 14:52
 */


public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NamelistService  service= new NamelistService();
        Employee[] employees=service.getAllEmployees();
        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }

    }
    @Test
    public void testGetEmployees(){
        NamelistService  service= new NamelistService();

        try {
            System.out.println(service.getEmployees(5));

        } catch (TeamException e) {

            System.out.println(e.getMessage());
        }

    }
}
