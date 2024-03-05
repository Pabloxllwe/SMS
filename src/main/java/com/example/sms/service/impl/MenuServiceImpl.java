package com.example.sms.service.impl;

import com.example.sms.mapper.MenuMapper;
import com.example.sms.mapper.RoleMapper;
import com.example.sms.pojo.Menu;
import com.example.sms.pojo.Role;
import com.example.sms.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenuList(int userId) {
        //先得到该用户的角色id列表
        List<Integer> roleIdList = roleMapper.getRoleList(userId);
        //根据role_ids批量查询menus
        return menuMapper.getMenuList(roleIdList);
    }
}
