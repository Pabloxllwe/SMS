package com.example.sms.service.impl;

import com.example.sms.mapper.StudentMapper;
import com.example.sms.pojo.PageBean;
import com.example.sms.pojo.Student;
import com.example.sms.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生业务接口实现类
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper stuMapper;

    /**
     * 分页查询学生信息列表
     * @param page
     * @param pageSize
     * @param name
     * @param clazz
     * @param grade
     * @return PageBean
     */
    @Override
    public PageBean page(Integer page, Integer pageSize, String name, String clazz, String grade) {
        //设置page helper
        PageHelper.startPage(page,pageSize);
        //执行查询
        List<Student> stuList = stuMapper.list(name, clazz, grade);
        Page<Student> stuPage = (Page<Student>) stuList;
        //封装PageBean对象
        return new PageBean(stuPage.getTotal(), stuPage.getResult());
    }
}
