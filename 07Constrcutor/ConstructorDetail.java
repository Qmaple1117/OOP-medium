
public class ConstructorDetail{

	//编写一个 main 方法
	public static void main(String[] args){

		Fine f = new Fine();
		System.out.println(f.name);

	}
}

class Fine{

	String name;
	int age;
	//1.构造器也可以重载
	public Fine(String name){

	}
	public Fine(String name, int age){

	}

	//2.构造器是初始化对象，不是创建对象
	//3.若无人工定义的构造器，系统会自动生成一个无参构造器（默认构造器）
	
	//4.一旦自己定义了构造器，默认构造器就会被覆盖，不能再使用默认构造器
	//  除非显式的定义一下(把默认构造器的形式写出来)
	Fine(){

	}
}