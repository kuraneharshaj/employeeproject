package com.myemployee.employeeproject.Service;

import com.myemployee.employeeproject.Entity.Department;
import com.myemployee.employeeproject.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentrepository;

    public void saveDepartment(Department department)
    {
        departmentrepository.save(department);
    }
}
