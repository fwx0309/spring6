package org.fwx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName ProxyFactory
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/6 17:21
 * @Version 1.0
 */
public class ProxyFactory {

    // 被代理对象
    private Object srcObj;

    public ProxyFactory(Object srcObj){
        this.srcObj = srcObj;
    }

    // 获取代理对象
    public Object getProxy(){
        /**
         * newProxyInstance()：创建一个代理实例
         * 其中有三个参数：
         * 1、classLoader：加载动态生成的代理类的类加载器
         * 2、interfaces：目标对象实现的所有接口的class对象所组成的数组
         * 3、invocationHandler：设置代理对象实现目标对象方法的过程，即代理类中如何重写接口中的抽象方法
         */
        ClassLoader classLoader = srcObj.getClass().getClassLoader();
        Class<?>[] interfaces = srcObj.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                // !!! 这里需要注意，传入的是需要被代理的对象
                Object result = method.invoke(srcObj, args);
                System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ result);
                return result;
            }
        };

        Object instance = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        return instance;
    }
}
