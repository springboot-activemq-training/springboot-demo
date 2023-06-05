package com.alpha.springbootdemo.controller;

import com.alpha.springbootdemo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controllers annotated with @RestController returns a response body
public class EmployeeController {

    @GetMapping("/employees")
    public Employee getEmployee(){
        return new Employee("Frederick", 18);
    }
}
