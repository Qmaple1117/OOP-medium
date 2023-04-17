
public class Homework12{

	//编写一个main方法
	public static void main(String[] args){

		//创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），提供三个构造方法，
		//可以初始化：
		//1.名字，性别，年龄，职位，薪水
		//2.名字，性别，年龄
		//3.职位，薪水
		//要求充分复用构造器
		
		/*
		1.名字是String，性别是String，年龄是int，职位是String，薪水是double
		2.要求提供三个构造方法，且要充分复用构造器，所以要用VariableParameter
		3.将职位和薪水设为可变参数
		 */
		
		//复用的意思是构造器可以被重复使用，题目理解错误
	}
}

class Tool12{
	String name;
	String gender;
	int age;
	String office;
	String salary;
	//1.名字，性别，年龄，职位，薪水
	//2.名字，性别，年龄
	public Tool12(String name, String gender, int age, String... information){
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.office = information[0];
		this.salary = information[1];
	}

	//3.职位，薪水
	public Tool12(String office, String salary){
		this.salary = salary;
		this.office = office;
	}
}