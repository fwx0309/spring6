package org.fwx;

import org.fwx.configration.SpringConf;
import org.fwx.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AllAnnotationTest
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/6 11:40
 * @Version 1.0
 */
public class AllAnnotationTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);

        UserController userController = context.getBean("userController", UserController.class);

        userController.add();
    }
}
