package com.Qmaple.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        /*
        不能随便查看人的年龄、工资等隐私，并对设置的年龄进行合理的验证，年龄合理就设置，
        否则给默认年龄，必须1~120，年龄和工资不能随便查看，
        名字的长度在2~6字符之间
         */
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(150);
        person.setSalary(12334);

        System.out.println(person.infor());
        System.out.println(person.getSalary());
        String name = "";
        int len = name.length();
        System.out.println(len);
    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //防止通过构造器绕过纠错机制，在构造器内调用set方法
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //手动输入get和set太麻烦，使用快捷键alt + insert，选getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //如果字符长度不在2~6，赋予其默认名
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        } else {
            System.out.println("输入的名字长度不在2~6字符范围内，已更改为默认名");
            this.name = "张三";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //年龄要在1~120岁之间
        if(age >= 1 && age <= 120){
            this.age = age;
        } else{
            System.out.println("输入的年龄应在1~120之间，已更改为默认年龄");
            this.age = 18;
        }
    }

    public double getSalary() {
        //可以编写代码设置权限，来判断访问者是否有查询的权限
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //获取所有信息
    public String infor(){
        return "名字：" + name + " 年龄：" + age + " 薪水：" + salary;
    }
}
