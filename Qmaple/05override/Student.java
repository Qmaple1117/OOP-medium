package com.Qmaple.override;

public class Student extends Person{
    private String id;
    private double score;
//构造器
    public Student() {
    }
    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
//set and get
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
//获取目标信息
    public String say(){
        return super.say() + "\t  ID：" + id + "\tScore：" + score;
    }
}
