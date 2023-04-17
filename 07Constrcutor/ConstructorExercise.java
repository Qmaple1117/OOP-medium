
public class ConstructorExercise{

	//编写一个 main 方法
	public static void main(String[] args){

		Person p1 = new Person();
		Person p2 = new Person("Qmaple", 17);
		System.out.println("p1的name是：" + p1.name + " age是：" + p1.age);
		System.out.println("p2的name是：" + p2.name + " age是：" + p2.age);
	}
}

class Person{

	String name;
	int age;

	//第一个构造器，利用构造器设置所有人的年龄为18
	public Person(){
		age = 18;
	}

	//第二个构造器，带pName和pAge两种参数，每次创建对象时初始化参数
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}