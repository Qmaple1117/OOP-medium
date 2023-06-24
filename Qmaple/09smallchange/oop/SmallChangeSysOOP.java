package com.Qmaple.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通主要功能的类
 */

public class SmallChangeSysOOP {
    //完成零钱通的各个功能
    private String details = "============零钱通明细============";
    private double balance = 0;//余额
    Date date = null;//date 是java.util.Date类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
    Scanner scanner = new Scanner(System.in);
    String choice = "";
    String decision = "";//是否退出零钱通
    double money = 0;//消费or存储金额
    String reason ="";

    boolean key = true;

    public SmallChangeSysOOP() {//目前不需要设置任何东西，所以不需要有参构造器
    }

    /**
     * 零钱通主要功能实现区
     */
    //1.菜单显示及功能调用
    public void menu() {

        do {
            System.out.println("============零钱通(OOP)菜单============");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退    出");
            System.out.println("请选择：1~4");
            choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println(this.getDetails());
                    break;
                case "2":
                    this.income();//调用存储方法
                    break;
                case "3":
                    this.expends();//调用消费方法
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入~");
            }
        } while (key);
        System.out.println("已退出零钱通");
    }

    //2.零钱通明细
    public String getDetails() {
        return details;
    }

    //3.收益入账
    public void income() {
        System.out.print("收益入账：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("存储金额需大于零");
            return;//退出方法
        }
        balance += money;
        date = new Date();//获取当前日期
        //添加明细信息
        details += "\n收益入账\t\t+" + money + "\t\t" + sdf.format(date) + "\t余额：" + balance;
    }

    //4.消费
    public void expends() {
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        System.out.print("消费说明：");
        reason = scanner.next();
        if (money <= 0) {
            System.out.println("消费金额不得小于零");
            return;
        }
        if (money > this.balance) {
            System.out.println("您目前的可消费金额为：0 ~ " + this.balance);
            return;
        }
        balance -= money;
        date = new Date();//获取当前日期
        //添加明细信息
        details += "\n" + reason + "\t\t\t-" + money + "\t\t" + sdf.format(date) + "\t余额：" + balance;
    }

    //5.是否确认退出
    public void exit() {
        while (true) {
            System.out.print("确认退出（y/n）：");
            decision = scanner.next();
            if ("y".equals(decision) || "n".equals(decision)) {
                break;
            }
        }
        if (decision.equals("y")) {
            key = false;
        }
    }
}
