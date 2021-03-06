package cn.michael.springbootmybatis.controller;

import cn.michael.springbootmybatis.bean.Department;
import cn.michael.springbootmybatis.bean.Employee;
import cn.michael.springbootmybatis.mapper.DepartmentMapper;
import cn.michael.springbootmybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("dept/{id}")
    public Department getDepartment(@PathVariable("id") int id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        System.out.println("Insert department.");
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("employee/{id}")
    public Employee getEmpById(@PathVariable("id") int id){
        return employeeMapper.getEmpById(id);
    }
}
