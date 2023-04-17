
public class ThisExercise{

	//编写一个 main 方法
	public static void main(String[] args){

		//定义 Person 类，里面有 name、age 属性，
		//并提供 compareTo 比较方法，用于判断是否和另一个人相等，
		//提供测试类 TestPerson用于测试, 名字和年龄完全一样，就返回 true, 否则返回false
		/*
		1.定义一个Person类，里面有 name，age 属性
		2.定义一个构造器，传入参数为 name 和 age
		2.定义返回值类型为boolean的compareTo 方法，传入参数为另一个人的名字，
		  比较时用this.name与name 相比较
		 */
		Person p = new Person("Qmaple", 17);
		System.out.println("p的名字是：" + p.name + " 年龄是：" + p.age);
		TestPerson p2 = new TestPerson("Qmaple", 17);
		System.out.println("p的名字是：" + p.name + " 年龄是：" + p.age);
		System.out.println("两者是否相同：" + p.compareTo(p2.name, p2.age));
	}
}

class Person{

	String name;
	int age;
	//定义一个构造器
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(String name, int age){
		return name.equals(this.name) && age == this.age;
	}
}

class TestPerson{

	String name;
	int age;
	//定义一个构造器
	public TestPerson(String name, int age){
		this.name = name;
		this.age = age;
	}
}