package com.Qmaple.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {

        //零钱通系统
        /*
        化繁为简：
        1.先完成菜单显示，并可以选择指令
        2.完成零钱通明细的显示
        3.完成收益入账的操作并显示数据
        4.退出前请用户确认
        5.完善消费or入账金额的合理性验证

        老韩建议：(1)建议一段代码完成一个小功能，尽量不要混在一起
                (2)写判断类代码时，先找不正确的条件，满足条件就跳出该段代码，可以有效避免嵌套
         */
        //1.菜单显示

        //2.显示明细
        //老韩思路：（1）可以将收益入账和消费保存到数组（2）使用对象保存--目前没想明白（3）使用String拼接
        String deTails = "============零钱通明细============";

        //3.收益入账
        double money = 0;//入账or消费金额
        double balance = 0;//余额
        Date date = null;//date 是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化

        //4.消费

        //退出确认
        String decision = "";

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        boolean key = true;
        do {
            System.out.println("============零钱通菜单============");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退    出");
            System.out.println("请选择：1~4");
            choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println(deTails);
                    break;
                case "2":
                    do {//验证金额是否为有效数据
                        System.out.print("收益入账：");
                        money = scanner.nextDouble();
                        if (money < 0) {
                            System.out.println("金额不能为负，请重新输入");
                        } else if (money == 0) {
                            System.out.println("金额不能为零，请重新输入");
                        } else {
                            break;
                        }
                    } while (true);
                    balance += money;
                    date = new Date();//获取当前日期
                    //添加明细信息
                    deTails += "\n收益入账\t\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "3":
                    //验证金额是否为有效数据
                    //这里条件少，之后条件多要先找不对的条件
                    //目前这代码有bug，触发后无法结束程序
                    do {
                        System.out.print("消费金额：");
                        money = scanner.nextDouble();
                        if (money > 0 && money <=balance ) {
                            break;
                        } else if(money > 0 && money >balance) {
                            System.out.println("消费金额大于余额");
                        } else if (money == 0) {
                            System.out.println("金额不能为零，请重新输入");
                        } else {
                            System.out.println("金额不能为负，请重新输入");
                        }
                    } while (true);
                    balance -= money;
                    date = new Date();//获取当前日期
                    //添加明细信息
                    deTails += "\n消费\t\t\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "4":
                    do {
                        System.out.print("确认退出（y/n）：");
                        decision = scanner.next();
                        if ("y".equals(decision)) {
                            key = false;
                            break;
                        } else if ("n".equals(decision)) {
                            break;
                        }
                    } while (true);
                    break;
                default:
                    System.out.println("输入有误，请重新输入~");
            }

        } while (key);

        System.out.println("已退出零钱通");
    }
}
