package com.Qmaple.polymorphic.polyparameter;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理" + getName() + "正在管理");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual() + bonus;
    }
}
