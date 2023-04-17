
public class This01{

	//编写一个 main 方法
	public static void main(String[] args){

		Person p2 = new Person("Qmaple", 17);
		System.out.println("p2的name是：" + p2.name + " age是：" + p2.age);
	}
}

class Person{

	String name;
	int age;

	//java虚拟机 会给每一个对象分配单独的 this 关键字
	//在哪个对象中使用 this前缀 this代表的就是哪一个对象
	//this.name 代表的是Person(this)中的name属性
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}