package com.laibao.mybatis3.simple.mapper.test;

import com.alibaba.fastjson.JSON;
import com.laibao.mybatis3.simple.mapper.SysRoleMapper;
import com.laibao.mybatis3.simple.model.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author laibao wang
 * @date 2017-12-27
 * @version 1.0
 */
public class SysRoleMapperTest extends BaseMapperTest{

    @Test
    public void testSelectRoleById() {
        SqlSession sqlSession = this.getSqlSession();
        try{
            long id = 1;
            SysRoleMapper sysRoleMapper = sqlSession.getMapper(SysRoleMapper.class);
            SysRole sysRole = sysRoleMapper.selectRoleById(id);
            System.out.println(JSON.toJSONString(sysRole));
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAllSysRoles() {
        SqlSession sqlSession = this.getSqlSession();
        try{
            SysRoleMapper sysRoleMapper = sqlSession.getMapper(SysRoleMapper.class);
            List<SysRole> sysRoleList = sysRoleMapper.selectAllSysRoles();
            System.out.println(JSON.toJSONString(sysRoleList));
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

}
