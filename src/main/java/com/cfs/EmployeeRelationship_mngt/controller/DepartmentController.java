package com.cfs.EmployeeRelationship_mngt.controller;

import com.cfs.EmployeeRelationship_mngt.entity.Department;
import com.cfs.EmployeeRelationship_mngt.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private  final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;

    }

    @PostMapping
    public Department saveDepartment(@RequestBody Department department)
    {
        return service.savedepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartment()
    {
        return service.getAllDepartment();
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Integer id)
    {
        return service.getDepartmentById(id);
    }




}
