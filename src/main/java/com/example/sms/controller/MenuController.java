package com.example.sms.controller;

import com.example.sms.pojo.Menu;
import com.example.sms.pojo.Result;
import com.example.sms.service.MenuService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping
    public Result getUserMenus(HttpServletRequest req){
        //从请求中获取已经解析的用户信息
        int userId = (int) req.getAttribute("userId");
        String username = (String) req.getAttribute("username");

        //根据用户信息查询对应的菜单列表
        List<Menu> menuList = menuService.getMenuList(userId);
        return Result.success(menuList);
    }
}
