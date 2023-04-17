
public class Constructor01{

	//编写一个 main 方法
	public static void main(String[] args){

		//建立一个对象并初始化
		//Person p = new Person("Qmaple");错误，和普通方法一样，参数数量与类型要与定义时一致
		Person p = new Person("Qmaple", 15);

		System.out.println("p的name为：" + p.name);
		System.out.println("p的age为：" + p.age);
	}
}

class Person{

	String name;
	int age;

	//构造器（是一种特别的方法）
	//1.构造器是没有返回值的，不要写返回值类型，连void都不行
	//2.构造器的名称和其所属的 类名称 是一样的
	//3.构造器的传参列表，规则和普通方法是一样的
	public Person(String nameP, int ageP){
		System.out.println("构造器被调用。。。");
		name = nameP;
		age = ageP;
	}
}