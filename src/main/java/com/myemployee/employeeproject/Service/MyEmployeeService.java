package com.myemployee.employeeproject.Service;

import com.myemployee.employeeproject.Entity.MyEmployee;
import com.myemployee.employeeproject.Repository.MyEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MyEmployeeService {
    @Autowired
    private MyEmployeeRepository myemployeerepository;

    public void saveMyEmployee(MyEmployee myemployee)
    {
        myemployeerepository.save(myemployee);
    }

    public List<MyEmployee> getAllMyEmployee()
    {
        return (List<MyEmployee>) myemployeerepository.findAll();
    }
    public Optional<MyEmployee> getMyEmployeeById(Integer id){
        System.out.println("Service Method");
        return myemployeerepository.findById(id);
    }

    public void deleteMyEmployee(Integer id) {
    myemployeerepository.deleteById(id);
    }
}
