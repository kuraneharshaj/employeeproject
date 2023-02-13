package com.myemployee.employeeproject.Repository;

import com.myemployee.employeeproject.Entity.MyEmployee;
import org.springframework.data.repository.CrudRepository;

public interface MyEmployeeRepository extends CrudRepository<MyEmployee, Integer> {
}
