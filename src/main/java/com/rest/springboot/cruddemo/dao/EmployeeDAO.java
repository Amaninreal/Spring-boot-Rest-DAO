package com.rest.springboot.cruddemo.dao;

import com.rest.springboot.cruddemo.entity.Employee;
import com.rest.springboot.cruddemo.service.EmployeeService;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteByID(int theID);
}
