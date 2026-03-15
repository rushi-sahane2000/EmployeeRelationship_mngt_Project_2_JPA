package com.cfs.EmployeeRelationship_mngt.service;

import com.cfs.EmployeeRelationship_mngt.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    Employee saveEmployee(Integer id,Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(Integer id);

    Employee updateEmployee(Integer id,Employee employee);

    void deleteEmployee(Integer id);
}
