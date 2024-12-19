package com.practise.loginForm.Employees;

import java.util.Date;

public record EmpReq(
        String employeeId,
        String name,
        String email,
        String phone,
        String department,
        Date dateOfJoining,
        String role
) {}


