package com.learn.springboot.Controller;

import com.learn.springboot.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")


public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/list")
    public List<Employee> getEmployeeDetails (){
        return employeeService.employeelist();
    }

    @RequestMapping("/list/{id}")
    public Employee getcity(@PathVariable Integer id)
    {
        return employeeService.getemployee(id);
    }

    @RequestMapping(method = RequestMethod.POST ,value = "/create")
    public List<Employee> createEmployee(@RequestBody  Employee employee){
        System.out.println("inside method");
       if (employeeService.createEmployee(employee)){
           return  employeeService.employeelist();
       }
       return null;

    }

    @RequestMapping(method = RequestMethod.PUT,value = "/update/{id}")
    public List<Employee> updateEmployee(@RequestBody Employee employee ,@PathVariable Integer id){
        return employeeService.updateEmployee(employee , id);
    }

    @RequestMapping(method = RequestMethod.DELETE ,value = "/delete/{id}")
    public List<Employee> deleteEmployee( @PathVariable Integer id){
        System.out.println(id);
        return employeeService.deleteEmployee(id);
    }

}
