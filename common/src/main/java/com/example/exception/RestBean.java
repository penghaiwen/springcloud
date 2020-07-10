package com.example.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 封装返回结果
 * </p>
 *
 * @author hdj
 * @date 2018/1/22 0022 11:00
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class RestBean implements Serializable {

    private static final long serialVersionUID = 1L;


    private int ret;

    private String msg;

    private Object data;

    public static RestBean error(String msg) {
        return error(500, msg);
    }

    public static RestBean error(Exception e) {
        return new RestBean(500, e.getMessage(), e);
    }

    public static RestBean error(Integer ret, String msg) {
        return new RestBean(ret, msg, null);
    }
    public static RestBean error(Integer ret, String msg,Object data) {
        return new RestBean(ret, msg, data);
    }
    public static RestBean ok(String msg) {
        return new RestBean(0, msg, null);
    }
    public static RestBean ok() {
        return new RestBean(0, "处理成功", null);
    }
    public static RestBean ok(Object data) {
        return new RestBean(0, null, data);
    }

    public static RestBean ok(Object data, String msg) {
        return new RestBean(0, msg, data);
    }
    public static RestBean ok(int ret,String msg,Object data ) {
        return new RestBean(ret, msg, data);
    }
}
