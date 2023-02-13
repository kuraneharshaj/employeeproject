package com.myemployee.employeeproject.Controller;

import com.myemployee.employeeproject.Entity.Department;
import com.myemployee.employeeproject.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentservice;

    @PostMapping("/saveDepartment")
    public void saveDepartment(@RequestBody Department department)
    {
        departmentservice.saveDepartment(department);
    }
}

