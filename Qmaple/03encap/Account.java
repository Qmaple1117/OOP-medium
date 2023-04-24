package com.Qmaple.encap;

public class Account {
    /*
    创建程序,在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性。
    Account 类要求具有属性：姓名（长度为 2 位 3 位或 4 位）、余额(必须>20)、
    密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
    通过 setXxx 的方法给 Account 的属性赋值。
    在 AccountTest 中测试
     */
    private String name;
    private double balance;
    private String code;

    public Account() {
    }
    public Account(String name, double balance, String code) {
        setName(name);
        setBalance(balance);
        setCode(code);
    }
    //设置与查看属性
    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len == 0){
            System.out.println("名字不能为空，已改为默认名");
            this.name = "张三";
        } else if(len >= 2 && len <=4){
            this.name = name;
        } else{
            System.out.println("名字长度应在2~4个字符，已更改为默认名");
            this.name = "张三";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20){
            this.balance = balance;
        } else if(balance < 0){
            System.out.println("余额不能为负，已更改为默认值");
            this.balance = 50;
        } else{
            System.out.println("余额不得少于20，已更改为默认值");
            this.balance = 50;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        int len = code.length();
        if(len == 0){
            System.out.println("密码不能为空，已更改为默认密码");
            this.code = "123456";
        } else if(len == 6){
            this.code = code;
        } else{
            System.out.println("名字长度应为6个字符，已更改为默认密码");
            this.code = "123456";
        }
    }
    //获取类的信息
    public String infor(){
        //可以增加权限的检查
        return "名字：" + name + " 余额：" + balance + " 密码：" + code;
    }
}
