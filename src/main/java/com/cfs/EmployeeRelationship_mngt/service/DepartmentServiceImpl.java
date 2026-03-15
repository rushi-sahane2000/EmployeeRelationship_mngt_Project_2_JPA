package com.cfs.EmployeeRelationship_mngt.service;

import com.cfs.EmployeeRelationship_mngt.entity.Department;
import com.cfs.EmployeeRelationship_mngt.exceptions.ResourceNotFoundException;
import com.cfs.EmployeeRelationship_mngt.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department savedepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Department not found with id="+id));
    }

}
