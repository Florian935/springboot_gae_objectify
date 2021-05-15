package com.server.appengine.service;

import com.server.appengine.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee getOne(String uuid);

    Employee save(Employee employee);

    void delete(String uuid);
}
