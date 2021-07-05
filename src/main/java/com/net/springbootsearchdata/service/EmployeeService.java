package com.net.springbootsearchdata.service;

import com.net.springbootsearchdata.model.Employee;
import com.net.springbootsearchdata.repositories.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAll(){
        return employeeDao.findAll();
    }

    public Employee get(long id){
        return employeeDao.findById(id).get();
    }

}
