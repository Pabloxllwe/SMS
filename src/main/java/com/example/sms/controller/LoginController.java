package com.example.sms.controller;

import com.example.sms.pojo.Result;
import com.example.sms.pojo.User;
import com.example.sms.service.UserService;
import com.example.sms.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/userLogin")
public class LoginController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录方法
     * @return JWT校验结果
     */
    @PostMapping
    public Result UserLogin(@RequestBody User user) {
        log.info("用户登陆：{}",user);
        // 调用用户服务，通过用户名和密码获取用户对象
        User u = userService.login(user);
        if (u != null) {
            HashMap<String, Object> claims = new HashMap<>();
            claims.put("id",u.getId());
            claims.put("username",u.getUsername());
            String jwt = JwtUtils.generateJwt(claims);//将哈希值生成jwt令牌
            return Result.success(jwt);
        }
        //登陆失败
        return Result.error("用户名或密码错误");
    }
}
