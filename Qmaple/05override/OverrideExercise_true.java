package com.Qmaple.override;

public class OverrideExercise_true {
    public static void main(String[] args) {

// 1) 编写一个 Person 类，包括属性/private（name、age）
//    ，构造器、方法 say(返回自我介绍的字符串）。
// 2) 编写一个 Student 类，继承 Person 类，增加 id、score 属性/private，
//    以及构造器，定义 say 方法(返回自我介绍的信息)。
// 3) 在 main 中,分别创建 Person 和 Student 对象，调用 say 方法输出自我
        Person 张三 = new Person("张三", 16);
        Student 李四 = new Student("李四", 18, "201923564125", 86.5);
        System.out.println(张三.say());
        System.out.println(李四.say());
    }
}
