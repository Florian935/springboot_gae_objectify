package com.server.appengine.service;

import com.server.appengine.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static com.googlecode.objectify.ObjectifyService.ofy;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> getAll() {
        return ofy().load().type(Employee.class).list();
    }

    @Override
    public Employee getOne(String uuid) {
        return ofy().load().type(Employee.class).id(uuid).safe();
    }

    @Override
    public Employee save(Employee employee) {
        employee.setUuid(UUID.randomUUID().toString());

        ofy().save().entity(employee).now();

        return employee;
    }

    @Override
    public void delete(String uuid) {
        ofy().delete().type(Employee.class).id(uuid).now();
    }
}
