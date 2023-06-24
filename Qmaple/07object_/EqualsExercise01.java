package com.Qmaple.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        /*
        判断两个 Person 对象内容是否相等，如果两个 Person 对象的各个属性值都一样，
        返回 true，否则返回 false。
         */
        Person person1 = new Person("jack", 15);
        Person person2 = new Person("jack", 15);

        //测试
        System.out.println(person1.equals(person1));
        System.out.println(person1.equals(person2));
    }
}

class Person{
    private String name;
    private int age;

    //重写equals方法
    public boolean equals(Person object){
        //如果目标与此对象地址相同，直接返回true
        if(this == object){
            return true;
        }
        //如果目标不属于Person类，直接返回false
        if(object instanceof Person){
            /*!!!!!
            非常奇怪，== 判断引用类型时是判断双方地址是否相同，但是下面的if在
            使用==时却没有任何问题，暂时不知道是什么原因
            */
            //if(this.name == object.name && this.age == object.age) {
            if(this.name.equals(object.name) && this.age == object.age) {
                return true;
            }
        } else{//不是全部相同就返回 false
            return false;
            }
        return false;
    }

    //构造器
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
