package com.itheima.dao.Impl;

import com.itheima.dao.UserDao;
import com.itheima.entiry.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class IUserDao implements UserDao {
    private JdbcTemplate jdbcTemplate;

    //提供set方法给jdbcTemplate赋值
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(User user) {
        try {
            jdbcTemplate.update("INSERT INTO user1(id,username,password) VALUES (?,?,?)",user.getId(),user.getUsername(),user.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("添加数据失败");
			System.out.println("解决冲突");
        }

    }
}
