package mitech.ajax.employeeinformations.controller;

import mitech.ajax.employeeinformations.entity.Employee;
import mitech.ajax.employeeinformations.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")

public class EmpController {
    EmployeeServices employeeServices;
    @Autowired
    public EmpController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }
    @GetMapping("getAllEmp")
    public List<Employee> getAllEmp() {
        return employeeServices.getAllEmployee();
    }
    @GetMapping("getEmpById/{id}")
    public Employee getById(@PathVariable Long id) {
        return employeeServices.getEmpById(id);
    }
    @PutMapping("updateEmp")
    public Employee updateEmp(@RequestBody Employee employee) {
        return employeeServices.update(employee);
    }
    @DeleteMapping("deleteEmp")
    public void deleteEmp(Long id) {
        employeeServices.deleteEmp(id);
    }
    @PostMapping("addEmp")
    public Employee addEmp(@RequestBody Employee employee) {
        return employeeServices.addEmp(employee);
    }
}
