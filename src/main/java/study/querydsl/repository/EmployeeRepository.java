package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
