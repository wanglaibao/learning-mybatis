package com.laibao.mybatis3.simple.mapper.test;

import com.alibaba.fastjson.JSON;
import com.laibao.mybatis3.simple.mapper.SysUserMapper;
import com.laibao.mybatis3.simple.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author laibao wang
 * @date 2017-12-27
 * @version 1.0
 */
public class SysUserMapperTest extends BaseMapperTest{

    @Test
    public void testSelectUserById() {
        SqlSession sqlSession = this.getSqlSession();
        try{
            long id = 1;
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser sysUser = sysUserMapper.selectUserById(id);
            System.out.println(JSON.toJSONString(sysUser));
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAllSysUsers() {
        SqlSession sqlSession = this.getSqlSession();
        try{
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            List<SysUser> sysUserList = sysUserMapper.selectAllSysUsers();
            System.out.println(JSON.toJSONString(sysUserList));
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

}
