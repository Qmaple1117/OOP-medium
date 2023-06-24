package com.Qmaple.polymorphic.polyarr;

public class PolyArray {
    public static void main(String[] args) {

        //现有一个继承结构如下：要求创建 1 个 Person 对象、2 个 Student 对象
        // 和 2 个 Teacher 对象, 统一放在数组中，并调用每个对象say 方法
        Person liHua = new Person("LiHua", 15);
        Student zhangsan = new Student("zhangsan", 12, 89.5);
        Student lisi = new Student("lisi", 12, 86.4);
        Teacher q = new Teacher("Q", 45, 15200);
        Teacher w = new Teacher("W", 35, 5600);

        Person[] arr = {liHua, zhangsan, lisi, q, w};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].say());
        }
    }
}
