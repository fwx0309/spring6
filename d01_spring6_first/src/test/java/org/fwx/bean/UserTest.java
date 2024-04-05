package org.fwx.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/5 14:57
 * @Version 1.0
 */
public class UserTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        User user = (User)context.getBean("user");

        user.say();
    }
}
