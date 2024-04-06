package org.fwx.bean;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ClassName D01Junit5Test
 * @Description spring 整合 junit5 测试
 * @Author Fwx
 * @Date 2024/4/6 23:03
 * @Version 1.0
 */
// 方式一
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean.xml")
// 方式二
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class D01Junit5Test {
    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
    }
}
