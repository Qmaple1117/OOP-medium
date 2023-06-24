package com.Qmaple.object_;

public class HashCode_ {
    /*
    老韩关于 hashCode方法 的六个小结：
    1、hashCode可以提高具有哈希结构的容器的效率！
    2、两个引用，如果指向的是同一个对象，则哈希值肯定是一样的！
    3、两个引用，如果指向的不是同一个对象，一般情况下，哈希值是不一样的
    4、哈希值主要根据地址号来的！不能完全将哈希值等价于地址。
    5、后面在集合中，hashCode如果需要的话，也会重写,在讲解集合的时候再讲如何重写

     */
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = a2;

        //验证 3 和 4
        System.out.println("a1的hashCode = " + a1.hashCode());
        System.out.println("a2的hashCode = " + a2.hashCode());
        System.out.println("a3的hashCode = " + a3.hashCode());
    }
}

class A{

}
