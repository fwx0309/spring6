package org.fwx.service;

import jakarta.annotation.Resource;
import org.fwx.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/6 11:27
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * @Resource：注解默认根据名称装配byName，未指定name时，使用属性名作为name。通过name找不到的话会自动启动通过类型byType装配。
     */
    //@Resource(name = "userDao")
    @Resource
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("UserService add...");
        userDao.add();
    }
}
