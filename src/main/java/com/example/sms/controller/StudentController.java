package com.example.sms.controller;

import com.example.sms.pojo.PageBean;
import com.example.sms.pojo.Result;
import com.example.sms.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService stuService;
    /**
     * 分页查询学生信息
     * @param page
     * @param pageSize
     * @param name
     * @param clazz
     * @param grade
     * @return Result(PageBean)
     */
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, String clazz,String grade){
        log.info("分页查询:第{}页,{}条记录,{},{},{}",page,pageSize,name,clazz,grade);
        PageBean pageBean = stuService.page(page,pageSize,name,clazz,grade);
        return Result.success(pageBean);
    }

}
