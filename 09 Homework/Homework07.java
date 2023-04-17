
public class Homework07{

	//编写一个main方法
	public static void main(String[] args){

		//Dog类，有名字颜色年龄，定义show方法显示其信息，并创建对象进行测试
		Dog d = new Dog("大白", "green", 3);
		d.show();

	}
}

class Dog{
	String name;
	String color;
	int age;

	public Dog(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(){
		System.out.println("狗的名字是：" + this.name);
		System.out.println("狗的颜色是：" + this.color);
		System.out.println("狗的年龄是：" + this.age);
	}
}