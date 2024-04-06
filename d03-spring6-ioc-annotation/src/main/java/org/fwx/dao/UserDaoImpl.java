package org.fwx.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/6 11:28
 * @Version 1.0
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDao add...");
    }
}
