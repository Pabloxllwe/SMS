package com.example.sms.mapper;

import com.example.sms.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {
    @Select("select role_id from user_role where user_id = #{userId}")
    List<Integer> getRoleList(int userId);
}
