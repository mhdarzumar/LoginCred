package com.practise.loginForm.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmpService ser;

    @PostMapping("/addAccount")
    public ResponseEntity<Employee> addAccount(@RequestBody EmpReq emp) {
        
        Employee savedEmployee = ser.addEmp(emp);

        if (savedEmployee != null) {
            System.out.println("adding employee");
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
    }
    @GetMapping("/getAll")
    public List<Employee> getAll()
    {
       return ser.getAll();
    }

}
