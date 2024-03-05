package com.example.sms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * author:Pablo
 * time:2024/3/5 0:37
 * 菜单实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private Integer id;//菜单ID
    private String menuName;//菜单名称
    private String menuUrl;//菜单URL
    private boolean isDeleted;//逻辑删除
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//修改时间
}
