package com.laibao.mybatis3.simple.mapper;

import com.laibao.mybatis3.simple.model.SysPrivilege;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author laibao wang
 * @date 2017-12-26
 * @version 1.0
 */
public interface SysPrivilegeMapper {
    SysPrivilege selectPrivilegeById(@Param("id") long id);
    List<SysPrivilege> selectAllSysPrivileges();
}
