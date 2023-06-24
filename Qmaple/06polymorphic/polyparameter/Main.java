package com.Qmaple.polymorphic.polyparameter;

public class Main {
    public static void main(String[] args) {
        /*
        定义员工类，私有属性：姓名与工资，方法：年工资
        普通员工和经理继承员工，
        普工员工多了work方法，经理多了奖金属性和manage方法
        两者皆重写年工资方法

        测试类中两方法：
        一是获取任何对象的年工资
        二是 如果对象是普工员工，调用work方法，是经理，调用manage方法
         */
        Employee[] arr = new Employee[20];//初始容量为20人
        arr[0] = new NormalEmployee("Q", 3000);
        arr[1] = new Manager("W", 5000, 6000);
        Test test = new Test();

        test.showEmpAnnual(arr[0]);
        test.showEmpAnnual(arr[1]);

        test.testWork(arr[0]);
        test.testWork(arr[1]);

        String a = "string";
        System.out.println("string" == a);
        "abc".equals("absh");
    }
}
