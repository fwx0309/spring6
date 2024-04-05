package org.fwx;

import org.fwx.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/5 16:17
 * @Version 1.0
 */
public class D01UserTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 1、根据 id 获取对象
        User user = (User) context.getBean("user");
        System.out.println("user = " + user);

        // 2、根据类型获取对象
        User user1 = context.getBean(User.class);
        System.out.println("user1 = " + user1);

        // 3、根据 id 和类型获取对象
        User user2 = context.getBean("user", User.class);
        System.out.println("user2 = " + user2);
    }
}
