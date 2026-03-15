package com.cfs.EmployeeRelationship_mngt.repository;

import com.cfs.EmployeeRelationship_mngt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}
