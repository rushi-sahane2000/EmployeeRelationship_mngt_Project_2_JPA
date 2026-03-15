package com.cfs.EmployeeRelationship_mngt.service;

import com.cfs.EmployeeRelationship_mngt.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
        Department savedepartment(Department department);
        List<Department> getAllDepartment();

        Department getDepartmentById(Integer id);



}
