package mitech.ajax.employeeinformations.services;

import mitech.ajax.employeeinformations.entity.Employee;
import java.util.*;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    Employee getEmpById(Long id);
    Employee addEmp(Employee employee);
    Employee update(Employee employee);
    public void deleteEmp(Long id);

}
