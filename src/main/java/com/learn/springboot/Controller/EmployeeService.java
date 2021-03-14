package com.learn.springboot.Controller;

import com.learn.springboot.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee>  employees = new ArrayList<>(Arrays.asList(new Employee(1,"XXX","Chennai"),
            (new Employee(2,"YYY","Bangalore"))));

    List<Employee> employeelist(){
        return employees;
    }

    Employee getemployee(Integer id){
        for(int i = 0 ; i <= employees.size();i++){
            if(employees.get(i).getId() == id)
                return employees.get(i);
        }
        return null;
    }


    public Boolean createEmployee(Employee employee) {
        employees.add(employee);
        for(int i = 0 ; i <= employees.size();i++){
            if(employees.get(i).getId() == employee.getId())
                return true;
        }
        return false;
    }

    public List<Employee> updateEmployee(Employee employee, Integer id) {
        for(int i =0 ; i <= employees.size();i++){
            if(employees.get(i).getId() ==  id){
                employees.set(i,employee);
//                employees.get(i).setName(employee.getName());
                return employees;
            }
        }return employees;
    }

    public List<Employee> deleteEmployee(Integer id) {
        int a =0;
        for(int i = 0 ; i < employees.size();i++){
            if(employees.get(i).getId() == (id)){
               a = i;
            }
        }
        employees.remove(a);
        return employees;

    }
}

