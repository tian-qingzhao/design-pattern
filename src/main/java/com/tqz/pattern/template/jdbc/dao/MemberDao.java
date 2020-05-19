package com.tqz.pattern.template.jdbc.dao;

import com.sun.scenario.effect.Merge;
import com.tqz.pattern.template.jdbc.JdbcTemplate;
import com.tqz.pattern.template.jdbc.Member;
import com.tqz.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @Author: tian
 * @Date: 2020/4/23 16:14
 * @Desc:
 */
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from t_student";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUserName(rs.getString("user_name"));
                member.setPassWord(rs.getString("pass_word"));
                member.setAge(rs.getInt("age"));
                member.setAddress(rs.getString("address"));
                member.setNickName(rs.getString("nick_name"));
                return member;
            }
        },null);
    }
}
