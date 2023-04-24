package com.Qmaple.pkg;

import java.util.Arrays;

//老韩建议：需要使用哪个类，就导入哪个类，不建议使用*导入
//import java.util.Scanner;//表示只引用java.util 包里的Scanner类
//import java.util.*;//表示引用 java.util 包下的所有类都引入
public class Import {

    public static void main(String[] args) {

        //使用系统提供的Arrays进行数组排序
        int[] arr = {12, 25, 13, -14};
        //传统方法是自己写排序
        //系统提供了相关的类，可以方便的完成  Arrays
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
