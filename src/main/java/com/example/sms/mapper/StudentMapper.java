package com.example.sms.mapper;

import com.example.sms.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 查询学生信息
     * xml--动态SQL
     * @return List<Student>
     */
    List<Student> list(String name, String clazz, String grade);
}
