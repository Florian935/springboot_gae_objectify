package com.server.appengine.controller;

import com.server.appengine.entity.Employee;
import com.server.appengine.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/{uuid}")
    public Employee getOne(@PathVariable String uuid) {
        return employeeService.getOne(uuid);
    }

    @PostMapping()
    public Employee saveObjectify(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @DeleteMapping("/{uuid}")
    public void deleteOne(@PathVariable String uuid) {
        employeeService.delete(uuid);
    }
}
