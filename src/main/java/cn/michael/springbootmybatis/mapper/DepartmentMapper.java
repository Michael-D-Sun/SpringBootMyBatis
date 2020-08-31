package cn.michael.springbootmybatis.mapper;

import cn.michael.springbootmybatis.bean.Department;
import org.apache.ibatis.annotations.*;

public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    Department getDeptById(int id);

    @Delete("delete from department where id=#{id}")
    int deleteDeptById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(name) values(#{name})")
    int insertDept(Department department);

    @Update("update department set name=#(name) where id=#{id}")
    int updateDept(Department department);
}
