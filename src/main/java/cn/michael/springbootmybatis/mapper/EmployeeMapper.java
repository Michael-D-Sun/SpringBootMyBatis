package cn.michael.springbootmybatis.mapper;

import cn.michael.springbootmybatis.bean.Employee;

public interface EmployeeMapper {

    Employee getEmpById(int id);
    void insertEmp(Employee employee);

}
