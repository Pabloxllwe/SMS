package com.example.sms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * author:Pablo
 * time:2024/3/5 0:29
 * 用户实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;//用户id
    private String username;//用户名
    private String password;//密码
    private boolean isDeleted;//逻辑删除
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//修改时间
}
