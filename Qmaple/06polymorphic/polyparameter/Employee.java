package com.Qmaple.polymorphic.polyparameter;

public class Employee {
    private String name;
    private int salary;

    //无参构造器先不写了，省时间
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //年工资
    public int getAnnual(){
        return salary * 12;
    }
}
