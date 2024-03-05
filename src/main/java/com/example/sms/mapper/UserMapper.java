package com.example.sms.mapper;

import com.example.sms.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    /**
     * 员工登录，获取员工的用户名和密码
     * @param user
     * @return
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    User getUsernameAndPwd(User user);
}
