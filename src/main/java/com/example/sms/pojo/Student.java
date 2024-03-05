package com.example.sms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * author:Pablo
 * time:2024/3/5 0:39
 * 学生实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;//学生ID
    private String name;//姓名
    private int clazz;//班级号
    private Integer grade;//年级
    private String avatar;//头像url
    private Integer userId;//用户ID
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//修改时间
}
