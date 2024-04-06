package org.fwx.proxy;

import org.fwx.utils.Calculator;
import org.fwx.utils.CalculatorImpl;
import org.junit.jupiter.api.Test;

/**
 * @ClassName ProxyFactoryTest
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/6 17:33
 * @Version 1.0
 */
public class ProxyFactoryTest {
    @Test
    public void test(){

        // 创建代理工厂类
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());

        // 获取被代理的对象
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        int add = proxy.add(1, 3);
        System.out.println("add = " + add);

    }
}
