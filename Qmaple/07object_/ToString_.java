package com.Qmaple.object_;

public class ToString_ {
    /*
    toString 方法
    默认返回：全类名 + @ + 哈希值的十六进制
         （ 全类名：包名加类名）
     */
    public static void main(String[] args) {
        Animals animals = new Animals("panda","bear");
        System.out.println(animals.toString());
        //不重写输出的是  com.Qmaple.object_.Animals@1540e19d

        //输出对象时，默认调用toSting方法
        System.out.println(animals);
    }
}

class Animals{
    private String name;
    private String sort;

    //快捷键就可以生成
    //alt + insert
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }

    //无参构造器先不写了
    public Animals(String name, String sort) {
        this.name = name;
        this.sort = sort;
    }
}
