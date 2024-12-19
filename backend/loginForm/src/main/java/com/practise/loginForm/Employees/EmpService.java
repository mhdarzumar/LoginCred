package com.practise.loginForm.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;

    public Employee addEmp(EmpReq emp) {
        // Create a new Employee object and manually map values from EmpReq
        Employee employee;
        employee = new Employee();
        employee.setEmployeeId(emp.employeeId());  // Map from EmpReq to Employee
        employee.setName(emp.name());
        employee.setEmail(emp.email());
        employee.setPhone(emp.phone());
        employee.setDepartment(emp.department());
        employee.setJoingDate(emp.dateOfJoining());
        employee.setRole(emp.role());

        // Save the Employee object using the repository
        Employee savedEmployee = repo.save(employee);

        return savedEmployee;  // Return the saved Employee
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }
}
