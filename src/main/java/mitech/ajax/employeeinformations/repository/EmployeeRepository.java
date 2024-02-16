package mitech.ajax.employeeinformations.repository;

import mitech.ajax.employeeinformations.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
