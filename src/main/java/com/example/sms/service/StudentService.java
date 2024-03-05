package com.example.sms.service;

import com.example.sms.pojo.PageBean;


/**
 * 学生业务接口
 */
public interface StudentService {
    /**
     * 分页查询列表
     * @param page
     * @param pageSize
     * @return PageBean
     */
    PageBean page(Integer page, Integer pageSize, String name, String clazz, String grade);
}
