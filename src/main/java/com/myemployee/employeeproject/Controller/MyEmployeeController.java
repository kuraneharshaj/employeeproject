package com.myemployee.employeeproject.Controller;

import com.myemployee.employeeproject.Entity.MyEmployee;
import com.myemployee.employeeproject.Service.MyEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyEmployeeController {
    @Autowired
    private MyEmployeeService myemployeeservice;

    @PostMapping("/saveMyEmployee")
    public void saveMyEmployee(@RequestBody MyEmployee myemployee)
    {
        myemployeeservice.saveMyEmployee(myemployee);
    }

    @GetMapping("/getAllMyEmployee")
    public List<MyEmployee> getAllMyEmployee()
    {
        return myemployeeservice.getAllMyEmployee();
    }

    @GetMapping("/getMyEmployee/{id}")
    public Object getMyEmployeeById(@PathVariable Integer id) {
        try {
            System.out.println("In TRY Block");
            Optional<MyEmployee> emp = myemployeeservice.getMyEmployeeById(id);
            return emp;

        } catch (Exception e) {
            System.out.println("In CATCH Block");
            return new ResponseEntity<MyEmployee>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateMyEmployee/{id}")
    public ResponseEntity<?> UpdateMyEmployee(@RequestBody MyEmployee emp, @PathVariable Integer id) {

        try {
            Optional<MyEmployee> emp1 = myemployeeservice.getMyEmployeeById(id);

            myemployeeservice.saveMyEmployee(emp);
            return new ResponseEntity<>(HttpStatus.OK);

        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/deleteMyEmployee/{id}")
    public void deleteMyEmployee(@PathVariable Integer id) {
        myemployeeservice.deleteMyEmployee(id);
    }
}
