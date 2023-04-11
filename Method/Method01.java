import java.util.Scanner;

public class Method01{
	//编写一个 main 方法
	public static void main(String[] args){
		//方法的调用（使用）
		//1.方法写好后如果不调用，是不会输出其内部代码的
		//2.先创建对象，然后调用方法即可
		Person p1 = new Person();
		p1.speak();//调用speak
		p1.cal01();
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入数字n的值：");
		int input = myScanner.nextInt();
		p1.cal02(input);
		
		System.out.print("请输入第一个数：");
		int num1 = myScanner.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = myScanner.nextInt();
		int returnSum = p1.getSum(num1, num2);
		System.out.println("两个数的和是：" + returnSum);
	}
}

class Person{
	String name;
	int age;

	//方法（成员方法）
	//添加speak成员方法输出：我是一个好人
	//1. public 表示该方法公开
	//2. void 表示该方法没有返回值
	//3. speak()：speak是方法名，（）是该方法的形参列表
	//4. {} 是方法体，里面是要执行的代码
	public void speak(){
		System.out.println("我是一个好人");
	}

	//添加cal01成员方法，可以计算 1+。。。。+1000 的结果
	public void cal01(){
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			sum += i;
		}
		System.out.println("和是：" + sum);
	}

	//添加cal02成员方法，可以接收一个数字 n ，计算 1+。。。。+n 的结果
	public void cal02(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println("计算结果是：" + sum);
	}

	//添加getSum成员方法，可以接收两个数字并计算和
	// int getSum 表示该方法执行后，会返回一个 int 值
	public int getSum(int num1, int num2){
		int sum = num1 + num2;
		// System.out.println("两个数的和是：" + sum);//直接输出也可以，将成员方法改成无返回值类型
		return sum;
	}
}