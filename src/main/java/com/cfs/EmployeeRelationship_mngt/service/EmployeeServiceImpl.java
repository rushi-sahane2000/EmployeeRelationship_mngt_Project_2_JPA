package com.cfs.EmployeeRelationship_mngt.service;

import com.cfs.EmployeeRelationship_mngt.entity.Department;
import com.cfs.EmployeeRelationship_mngt.entity.Employee;
import com.cfs.EmployeeRelationship_mngt.exceptions.ResourceNotFoundException;
import com.cfs.EmployeeRelationship_mngt.repository.DepartmentRepository;
import com.cfs.EmployeeRelationship_mngt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private  DepartmentRepository departmentRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Employee saveEmployee(Integer id, Employee employee) {
        Department department=departmentRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Department Not Found with id="+id));

        employee.setDepartment(department);
        return  employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee not found with id="+id));
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee=employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee not found with id="+id));
        existingEmployee.setName(employee.getName());

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setSalary(employee.getSalary());

        if (employee.getDepartment()!=null && employee.getDepartment().getId()!=null)
        {
            Department department=departmentRepository.findById(id)
                    .orElseThrow(()-> new ResourceNotFoundException("Department not found with id="+id));
            existingEmployee.setDepartment(department);
        }
        return  employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        Employee existingEmployee=employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee not found with id="+id));
        employeeRepository.delete(existingEmployee);
    }
}
