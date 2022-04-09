package study.querydsl.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.querydsl.entity.Employee;
import study.querydsl.entity.EmployeeInfo;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeInfoRepository employeeInfoRepository;

    @Autowired
    EntityManager em;

    @Test
    void employee_insert() {

        Employee employee = new Employee();
        employee.setName("test");
        employee.setAge(10);

        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setDetailAddress("address");
        employeeInfo.setTel("1111");

        Employee save = employeeRepository.save(employee);
        employeeInfo.setEmployee(save);
        employeeInfoRepository.save(employeeInfo);

    }


}