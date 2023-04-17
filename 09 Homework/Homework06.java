import java.util.Scanner;

public class Homework06{

	//编写一个main方法
	public static void main(String[] args){

		//编程创建一个Cale计算类，在其中定义 2 个变量表示两个操作数，
		//定义四个方法实现求和、差、乘、商（除数为 0 的话，要提示）并创建两个对象分别测试
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		double num1 = myScanner.nextDouble();
		System.out.print("请输入第二个数：");
		double num2 = myScanner.nextDouble();

		Cale c = new Cale(num1, num2);

		c.sum();
		c.subtract();
		c.multiply();
		c.devide();


	}
}

class Cale{
	double num1;
	double num2;

	public Cale(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	public void sum(){
		double res = this.num1 + this.num2;
		System.out.println("两个数的和为：" + res);
	}

	public void subtract(){
		double res = this.num1 - this.num2;
		System.out.println("两个数的差为：" + res);
	}

	public void multiply(){
		double res = this.num1 * this.num2;
		System.out.println("两个数的乘积为：" + res);
	}

	public void devide(){
		if(this.num2 != 0){
			double res = this.num1 / this.num2;
			System.out.println("两个数的商为：" + res);
		} else{
			System.out.println("除数为0，商无法计算");
		}
		
	}
}