package mitech.ajax.employeeinformations.services;

import mitech.ajax.employeeinformations.entity.Employee;
import mitech.ajax.employeeinformations.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServicesImpl implements EmployeeServices{
    EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServicesImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmpById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee addEmp(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmp(Long id) {
         employeeRepository.delete(getEmpById(id));
    }
}
