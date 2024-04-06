package org.fwx.reflect;

/**
 * @ClassName Dog
 * @Description 用于测试反射的实体类
 * @Author Fwx
 * @Date 2024/4/6 15:23
 * @Version 1.0
 */
public class Dog {
    private String name;

    private Dog(){}

    private Dog(String name){
        this.name = name;
    }

    private void run(){
        System.out.println("dog run...");
    }

    private void run(String name){
        System.out.println(name + " run...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
