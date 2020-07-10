package com.example.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.security.JwtUser;
import com.example.sys.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
public interface  SysUserMapper extends BaseMapper<SysUser> {

    /**
     * @return
     * @Author 老默
     * @Description
     * @Date 2020/4/29 10:41
     * @param: userName
     **/
    JwtUser getUserByUsername(@Param("userName") String userName);
}
