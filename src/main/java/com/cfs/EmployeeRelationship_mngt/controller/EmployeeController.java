package com.cfs.EmployeeRelationship_mngt.controller;

import com.cfs.EmployeeRelationship_mngt.entity.Department;
import com.cfs.EmployeeRelationship_mngt.entity.Employee;
import com.cfs.EmployeeRelationship_mngt.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/department/{departmentId}")
    public Employee saveEMployee(@PathVariable Integer departmentId, @RequestBody Employee employee)
    {
        return  service.saveEmployee(departmentId,employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return service.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id)
    {
        return service.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id)
    {
        service.deleteEmployee(id);
        return "Employee Delete SuccessFully....!!!!";
    }
}
