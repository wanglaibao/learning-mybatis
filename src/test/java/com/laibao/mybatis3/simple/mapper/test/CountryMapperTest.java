package com.laibao.mybatis3.simple.mapper.test;

import com.alibaba.fastjson.JSON;
import com.laibao.mybatis3.simple.mapper.CountryMapper;
import com.laibao.mybatis3.simple.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author laibao wang
 * @date 2017-12-26
 * @version 1.0
 */
public class CountryMapperTest extends BaseMapperTest{

    @Test
    public void testInsertCountry() {
        SqlSession sqlSession = getSqlSession();
        try{
            Country country = new Country();
            country.setCountryName("小日本");
            country.setCountryCode("XRB");
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            countryMapper.insertCountry(country);
            sqlSession.commit(true);     //必须要调用这个方法，否则无法保存入库,commit 默认是false的
        }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateCountry() {
        SqlSession sqlSession = getSqlSession();
        try {
            long id = 11;
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            Country country = countryMapper.selectCountryById(id);
            country.setCountryName("狗日的小日本!");
            country.setCountryCode("GRDRB");
            countryMapper.updateCountry(country);
            sqlSession.commit(true);    //必须要调用这个方法，否则无法保存入库,commit 默认是false的
        }catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


    @Test
    public void testDeleteCountryById() {
        SqlSession sqlSession = getSqlSession();
        try {
            long id = 10;
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            countryMapper.deleteCountryById(id);
            sqlSession.commit(true);    //必须要调用这个方法，否则无法保存入库,commit 默认是false的
        }catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            //List<Country> countryList = sqlSession.selectList("selectAll");
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            List<Country> countryList = countryMapper.selectAll();
            //printCountryList(countryList);
            System.out.println(JSON.toJSONString(countryList));
        }catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectById() {
        SqlSession sqlSession = getSqlSession();
        try {
            long id = 11;
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            Country country = countryMapper.selectCountryById(id);
            System.out.println(JSON.toJSONString(country));
        }catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Deprecated
    private void printCountryList(List<Country> countryList){
        for(Country country : countryList){
            System.out.printf("%-4d%4s%4s\n",country.getId(), country.getCountryName(), country.getCountryCode());
        }
    }
}
