package com.Qmaple.debug_09;

public class Debug01 {
    public static void main(String[] args) {
        //演示逐行执行代码
        //选择要断点调试的行数后，不可以直接用运行，要用debug才能进入调试界面
        //进入后按F6（正常是F8，应该，以程序当前显示为准）就可以逐行调试了
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + sum);
        }
        System.out.println("程序结束...");
    }
}
