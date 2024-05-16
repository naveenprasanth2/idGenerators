package com.bharath.springdata.idgenerators;

import com.bharath.springdata.idgenerators.entity.Employee;
import com.bharath.springdata.idgenerators.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IdGeneratorsApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Test
    void testCreateEmployee() {
        employeeRepository.save(Employee.builder().name("naveen").build());
    }

}
