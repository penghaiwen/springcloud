package com.example.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sys.entity.SysUser;
import com.example.sys.mapper.SysUserMapper;
import com.example.sys.service.ISysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUser {
    @Resource
    private SysUserMapper mapper;
    @Override
    public SysUser getUserByUsername(String userName) {
        return mapper.getUserByUsername(userName);
    }

}
