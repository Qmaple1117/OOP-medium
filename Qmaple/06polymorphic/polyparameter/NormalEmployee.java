package com.Qmaple.polymorphic.polyparameter;

public class NormalEmployee extends Employee{
    public NormalEmployee(String name, int salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工" + getName() + "正在工作");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual();
    }
}
