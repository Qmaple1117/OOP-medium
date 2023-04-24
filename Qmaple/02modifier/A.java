package com.Qmaple.modifier;

public class A {

    public int a1 = 10;
    protected int a2 = 20;
    int a3 = 30;
    private int a4 = 40;

    //该方法可以输出四种修饰符修饰的属性
    public void m1(){
        System.out.println("a1=" + a1 + " a2=" + a2 +
                " a3=" + a3 + " a4=" + a4);
    }
}
