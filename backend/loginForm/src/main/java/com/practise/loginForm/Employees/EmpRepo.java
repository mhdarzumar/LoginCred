package com.practise.loginForm.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepo extends JpaRepository<Employee, String> {

}
