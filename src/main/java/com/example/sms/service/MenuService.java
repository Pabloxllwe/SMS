package com.example.sms.service;

import com.example.sms.pojo.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> getMenuList(int userId);
}
