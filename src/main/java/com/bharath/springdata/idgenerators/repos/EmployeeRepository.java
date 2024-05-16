package com.bharath.springdata.idgenerators.repos;

import com.bharath.springdata.idgenerators.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
