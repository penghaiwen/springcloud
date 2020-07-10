package com.example.oauth;



import com.example.security.JwtUser;
import com.example.service.UserService;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private UserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        JwtUser user=sysUserService.getJwtUserByUserName();
        return user;
    }


}
