import java.util.Scanner;

public class Homework05{

	//编写一个main方法
	public static void main(String[] args){

		//定义一个圆类Circle，定义属性：半径，
		//提供显示圆周长功能的方法，提供显示圆面积的方法
		//radius 半径     circumference 周长     area 面积
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入圆半径：");
		double radius = myScanner.nextDouble();
		Circle c = new Circle(radius);

		System.out.println("圆的周长为：" + c.circleCircum());
		System.out.println("圆的面积为：" + c.circleArea());
	}
}

class Circle{

	double radius;
	//构造器
	public Circle(double radius){
		this.radius = radius;
	}

	public double circleCircum(){
		return 2 * 3.14 * this.radius;
	}

	public double circleArea(){
		return 3.14 * this.radius * this.radius;
	}
}