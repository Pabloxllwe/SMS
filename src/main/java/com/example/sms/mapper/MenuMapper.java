package com.example.sms.mapper;

import com.example.sms.pojo.Menu;
import com.example.sms.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<Menu> getMenuList(List<Integer> roleIdList);
}
