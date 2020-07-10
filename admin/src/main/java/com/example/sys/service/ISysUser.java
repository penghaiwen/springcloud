package com.example.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.security.JwtUser;
import com.example.sys.entity.SysUser;


public interface ISysUser extends IService<SysUser> {
    JwtUser getUserByUsername(String userName);
}
