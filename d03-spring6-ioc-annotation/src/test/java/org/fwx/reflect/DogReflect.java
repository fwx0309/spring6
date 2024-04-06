package org.fwx.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName DogReflect
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/6 15:26
 * @Version 1.0
 */
public class DogReflect {
    @Test
    public void test() throws Exception {
        // 1、获取字节码对象
//        Class<Dog> dogClass = Dog.class;
        Class dogClass = Class.forName("org.fwx.reflect.Dog");

        // 2、获取构造方法
        Constructor constructor = dogClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();

        // 3、获取属性
        Field name = dogClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"mike");
        System.out.println("o = " + o);

        // 4、获取方法
        Method run = dogClass.getDeclaredMethod("run");
        run.setAccessible(true);
        run.invoke(o);

        Method run1 = dogClass.getDeclaredMethod("run", String.class);
        run1.setAccessible(true);
        run1.invoke(o,"Tomi");

    }
}
