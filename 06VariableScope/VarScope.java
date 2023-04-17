
public class VarScope{

	//编写一个 main 方法
	public static void main(String[] args){

		Cat cat = new Cat();
		cat.at();
	}
}

class Cat{

	public void cry(){
		//1.局部变量一般是指在成员方法中定义的变量
		//  a 和name 就是局部变量，只能在cry 方法内使用，即作用域在cry中
		int a = 0;
		String name = "1354";
	}

	//2.全局变量：也就是属性，作用域为整个类体
	//  属性在定义的时候，可以直接赋值
	//
	//  局部变量：除了属性之外的变量
	int age = 1;

	public void eat(){
		System.out.println("在eat方法中使用age属性：" + age);
	}

	//3.全局变量（属性）可以直接使用，因为有默认值
	//  局部变量不可直接使用，需要赋值

	//4.全局变量（属性）可以加修饰符（public private protected ...）
	//  局部变量不可以加修饰符  
}