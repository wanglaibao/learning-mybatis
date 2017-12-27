package com.laibao.mybatis3.simple.mapper;

import com.laibao.mybatis3.simple.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author laibao wang
 * @date 2017-12-27
 * @version 1.0
 */
public interface SysUserMapper {
    SysUser selectUserById(@Param("id") Long id);
    List<SysUser> selectAllSysUsers();
}
