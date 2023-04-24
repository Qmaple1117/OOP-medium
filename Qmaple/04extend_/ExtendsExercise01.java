package com.Qmaple.extend_;

/**
 * 编写 Computer 类，包含 CPU、内存、硬盘等属性，getDetails 方法用于返回 Computer 的详细信息
 * 编写 PC 子类，继承 Computer 类，添加特有属性【品牌 brand】
 * 编写 NotePad 子类，继承 Computer 类，添加特有属性【color】
 * 在 main 方法中创建 PC 和 NotePad 对象，分别给对象中特有的属性赋值，以及从 Computer 类继承的
 * 属性赋值，并使用方法并打印输出信息
 */
public class ExtendsExercise01 {
    public static void main(String[] args) {

        //创建对象
        PC pc = new PC();
        NotePad notePad = new NotePad();

        pc.setCpu("intel");
        pc.setMemory(16);
        pc.setHardDisk(400);
        pc.setBrand("英特尔");
        notePad.setCpu("SEA");
        notePad.setMemory(8);
        notePad.setHardDisk(128);
        notePad.setColor("green");
        //输出两个对象的信息
        System.out.println("===pc的信息如下===");
        System.out.println(pc.getDetails() + pc.getBrand());
        System.out.println("===notePad的信息如下===");
        System.out.println(notePad.getDetails() + notePad.getColor());
    }
}

class Computer {
    private String cpu;
    private double memory;//内存
    private int hardDisk;//硬盘

    //可在设置方法中设置访问权限的检查，防止被随意更改
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setMemory(double memory) {
        this.memory = memory;
    }
    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getDetails() {
        return "设备的详细信息为:\n" + "cpu：" + cpu +
                " memory：" + memory + "GB" + " hardDisk：" + hardDisk + "GB";
    }
}

class PC extends Computer {
    private String brand;//品牌

    public void setBrand(String brand) {
        //可设计检查访问权限的功能
        this.brand = brand;
    }

    public String getBrand() {
        return " brand：" + brand;
    }
}

class NotePad extends Computer {
    private String color;

    public void setColor(String color) {
        //可设计检查访问权限的功能
        this.color = color;
    }

    public String getColor() {
        return " color：" + color;
    }
}
