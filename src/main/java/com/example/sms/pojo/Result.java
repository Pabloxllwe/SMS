package com.example.sms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;  // 错误码
    private String msg;  // 错误信息
    private Object data;  // 数据对象

    //增删改成功响应
    public static Result success() {
        return new Result(1, "success", null);
    }

    //查询成功响应
    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    //失败响应
    public static Result error(String msg) {
        return new Result(0, msg, null);
    }
}
