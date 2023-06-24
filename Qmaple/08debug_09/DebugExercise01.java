package com.Qmaple.debug_09;

public class DebugExercise01 {
    //观察对象的创建步骤是否与学到的一样
    public static void main(String[] args) {
        Person person = new Person("qmaple", 16, "man");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());

        //观察动态绑定机制，这里没有代码，想验证的时候自己写
    }
}

class Person{
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}