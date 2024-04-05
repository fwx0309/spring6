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
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_di.xml");

        User userset = context.getBean("userset", User.class);
        System.out.println("userset = " + userset);

        User usercon = context.getBean("usercon", User.class);
        System.out.println("usercon = " + usercon);
    }
}
