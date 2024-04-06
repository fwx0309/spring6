package org.fwx.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName D02Junit4Test
 * @Description spring 整合 junit4 测试
 * @Author Fwx
 * @Date 2024/4/6 23:10
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class D02Junit4Test {
    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
    }
}
