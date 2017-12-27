package com.laibao.mybatis3.simple.mapper.test;

import com.alibaba.fastjson.JSON;
import com.laibao.mybatis3.simple.mapper.SysPrivilegeMapper;
import com.laibao.mybatis3.simple.model.SysPrivilege;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author laibao wang
 * @date 2017-12-27
 * @version 1.0
 */
public class SysPrivilegeMapperTest extends BaseMapperTest {

    @Test
    public void testSelectUserById() {
        SqlSession sqlSession = this.getSqlSession();
        try{
            long id = 1;
            SysPrivilegeMapper sysPrivilegeMapper = sqlSession.getMapper(SysPrivilegeMapper.class);
            SysPrivilege sysPrivilege = sysPrivilegeMapper.selectPrivilegeById(id);
            System.out.println(JSON.toJSONString(sysPrivilege));
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
            SysPrivilegeMapper sysPrivilegeMapper = sqlSession.getMapper(SysPrivilegeMapper.class);
            List<SysPrivilege> sysPrivilegeList = sysPrivilegeMapper.selectAllSysPrivileges();
            System.out.println(JSON.toJSONString(sysPrivilegeList));
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
