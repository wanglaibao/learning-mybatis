package com.laibao.mybatis3.simple.mapper;

import com.laibao.mybatis3.simple.model.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author laibao wang
 * @date 2017-12-26
 * @version 1.0
 */
public interface CountryMapper {
     List<Country> selectAll();
     void insertCountry(Country country);
     Country selectCountryById(@Param("id") long id);
     void updateCountry(Country country);
     void deleteCountryById(@Param("id") long id);
}
