package com.tqz.pattern.template.jdbc;

import com.tqz.pattern.template.jdbc.dao.MemberDao;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: tian
 * @Date: 2020/4/23 16:33
 * @Desc:
 */
public class TestMemberDao {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);

        List<?> objects = memberDao.selectAll();
        System.out.println(objects.toArray());
    }
}
