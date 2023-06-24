package com.Qmaple.polymorphic.polyparameter;

public class Test {
    //获取对象的年工资
    public void showEmpAnnual(Employee e){
        System.out.println("对象的年工资是：" + e.getAnnual());
    }

    public void testWork(Employee e){
        if(e instanceof NormalEmployee){
            ((NormalEmployee) e).work();
        } else if(e instanceof Manager){
            ((Manager) e).manage();
        } else{
            System.out.println("传入对象有误");
        }
    }
}
