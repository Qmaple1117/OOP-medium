package com.Qmaple.modifier;

public class B {
    public void say() {

        A a = new A();
        a.m1();

        //在B类中只能输出public，protected以及 默认 的属性
        //private修饰的属性只能在同类中使用
        System.out.println("a1=" + a.a1 + " a2=" + a.a2 + " a3=" + a.a3);
    }
}
