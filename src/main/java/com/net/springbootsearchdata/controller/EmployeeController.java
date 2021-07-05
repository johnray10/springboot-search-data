package com.net.springbootsearchdata.controller;

import com.net.springbootsearchdata.model.Employee;
import com.net.springbootsearchdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String add(Model model){
        List<Employee> employeeList = employeeService.getAll();
        model.addAttribute("employee",new Employee());
        return "index";
    }

    @PostMapping("/search")
    public String doSearchEmployee(@ModelAttribute("employeeSearchFormData") Employee employee, Model model){
        Employee emp = employeeService.get(employee.getId());
        model.addAttribute("employee",emp);
        return "index";
    }
}
