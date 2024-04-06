package org.fwx;

import org.fwx.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName D03Di
 * @Description 对象属性注入
 * @Author Fwx
 * @Date 2024/4/5 17:43
 * @Version 1.0
 */
public class D03UserDi {
    /**
     * 普通属性注入
     */
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_di.xml");

        User userset = context.getBean("userset", User.class);
        System.out.println("userset = " + userset);

        User usercon = context.getBean("usercon", User.class);
        System.out.println("usercon = " + usercon);
    }

    /**
     * 对象属性注入，外部 bean 注入
     */
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_di.xml");

        User user = context.getBean("user", User.class);
        System.out.println("user = " + user);
        user.run();
    }

    /**
     * 对象属性注入，内部 bean 注入
     */
    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_di.xml");

        User user1 = context.getBean("user1", User.class);
        System.out.println("user1 = " + user1);
        user1.run();
    }

    /**
     * 对象属性注入，级联赋值
     */
    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_di.xml");

        User user2 = context.getBean("user2", User.class);
        System.out.println("user2 = " + user2);
        user2.run();
    }

    /**
     * 数组数据注入
     */
    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_di.xml");

        User user = context.getBean("user3", User.class);
        System.out.println("user = " + user);
        user.run();
    }
}
