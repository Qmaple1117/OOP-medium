
public class MethodExercise02{

	//编写一个 main 方法
	public static void main(String[] args){

		//编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。
		//克隆对象， 注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
		//
		Person person = new Person();
		person.name = "张三";
		person.age = 118;
		System.out.println("修改前的person.name：" + person.name);
		
		MyTools tool = new MyTools();
		Person copyPerson = tool.copyPerson(person);
		System.out.println("修改前的copyPerson.name：" + copyPerson.name);
		person.name = "里斯";
		System.out.println("修改后的person.name：" + person.name);
		System.out.println("修改person.name后的copyPerson.name：" + copyPerson.name);

		//韩老师提示：可以通过输出对象的 hashCode 确定对象是否是独立的一个
		//也可以通过对象的比较确定
		System.out.println(person == copyPerson);
	}
}

class Person{

	String name;
	int age;
}

class MyTools{

	public Person copyPerson(Person p){//返回值类型可以是对象，注意想要返回对象不要写class，那是类
		Person person02 = new Person();//形参列表里的数据类型是 对象所属类的名称
		person02.name = p.name;
		person02.age = p.age;
		return person02;
	}
}