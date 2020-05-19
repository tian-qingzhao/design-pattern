package com.tqz.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * @Author: tian
 * @Date: 2020/4/23 15:52
 * @Desc: ORM映射定制化的接口
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;
}
