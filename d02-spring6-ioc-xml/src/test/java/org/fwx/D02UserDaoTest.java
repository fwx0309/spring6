package org.fwx;

import org.fwx.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName D02UserDaoTest
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/5 16:42
 * @Version 1.0
 */
public class D02UserDaoTest {
    @Test
    public void test(){
        // 当一个接口有两个实现类时，用类型获取实例对象会报错。用 id 获取即可。
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 会报错！！！
        // org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        // No qualifying bean of type 'org.fwx.dao.UserDao' available: expected single matching bean but found 2: userDao,user1Dao
        // UserDao userDao = context.getBean(UserDao.class);
        // userDao.run();

        UserDao user1Dao = context.getBean("user1Dao", UserDao.class);
        System.out.println("user1Dao = " + user1Dao);
    }
}
