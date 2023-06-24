package com.Qmaple.override;

public class Person {
    private String name;
    private int age;
    //构造器
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //set and get

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
//获取目标信息
    public String say(){
        return "名字：" + name + "\t年龄：" + age;
    }
}
