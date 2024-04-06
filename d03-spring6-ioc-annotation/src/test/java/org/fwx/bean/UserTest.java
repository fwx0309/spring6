package org.fwx.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserTest
 * @Description xml 配置和注解测试
 * @Author Fwx
 * @Date 2024/4/5 23:42
 * @Version 1.0
 */
public class UserTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        User user = context.getBean("user", User.class);

        System.out.println("user = " + user);
    }
}
