package org.fwx.bean;

import java.util.Arrays;

/**
 * @ClassName User
 * @Description TODO
 * @Author Fwx
 * @Date 2024/4/5 16:15
 * @Version 1.0
 */
public class User {
    private String name;
    private int age;

    private Dept dept;

    private String[] hobby;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, Dept dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void run(){
        System.out.println(this.name +" run ...");
        dept.info();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
