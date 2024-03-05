package com.example.sms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * author:Pablo
 * time:2024/3/5 0:34
 * 角色实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Integer id;//角色ID
    private String roleName;//角色名称：管理员，辅导员，学生
    private boolean isDeleted;//逻辑删除
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//修改时间
}
