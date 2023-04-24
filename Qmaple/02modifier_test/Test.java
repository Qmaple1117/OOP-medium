package com.Qmaple.modifier_test;

import com.Qmaple.modifier.A;
import com.Qmaple.modifier.A02;
import com.Qmaple.modifier.B;

public class Test {
    public static void main(String[] args) {

        //因为该类与 A 所在的类处于不同的包内，
        //所以只有 A 中被public修饰的属性可以被Test访问
        A a = new A();
        B b = new B();
        A02 a02 = new A02();
        b.say();
        a02.say();
        System.out.println("a1=" + a.a1);
    }
}
