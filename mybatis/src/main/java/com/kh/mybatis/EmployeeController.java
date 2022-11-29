package com.kh.mybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired // 의존성 주입
    private EmployeeMapper employeeMapper;
    @PostMapping("")
    public Employee post(@RequestBody Employee employee) {
        employeeMapper.insert(employee);
        return employee;
    }
    @GetMapping("")
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }
    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") int id) {
        return employeeMapper.getById(id);
    }
}
