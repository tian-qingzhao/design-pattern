package com.tqz.pattern.template.jdbc;

import com.sun.rowset.internal.Row;

import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @Author: tian
 * @Date: 2020/4/23 15:54
 * @Desc:
 */
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values){
        try {
            Connection connection = getConnection();
            PreparedStatement ps = createPrepareStatement(connection,sql);
            ResultSet rs = executeQuery(ps, values);
            List<?> list = parseResultSet(rs, rowMapper);
            close(connection,ps,rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected  void close(Connection connection, PreparedStatement ps, ResultSet rs){
        try {
            if (connection != null){
                connection.close();
            }
            if (ps != null){
                ps.close();
            }
            if (rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper)throws Exception{
        ArrayList<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    protected ResultSet executeQuery(PreparedStatement ps, Object[] values) throws SQLException {
        for (int i=0; i<values.length;i++){
            ps.setObject(i,values[i]);
        }
        return ps.executeQuery();
    }

    protected PreparedStatement createPrepareStatement(Connection connection, String sql) throws Exception{
        return connection.prepareStatement(sql);
    }

    protected Connection getConnection() throws Exception{
        return this.dataSource.getConnection();
    }
}
