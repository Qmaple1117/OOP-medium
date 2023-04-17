import java.util.Scanner;

public class Homework13{

	//编写一个main方法
	public static void main(String[] args){

		//（1）定义一个圆类Circle，包含一个double类型的radius属性代表圆的半径
		//		findArea（）方法返回圆的面积
		//（2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
		//	   public void printAreas(Circle c, int times)
		//（3）在printAreas方法中打印输出 1 到 times 之间的每个整数半径值，以及对应的面积。
		//    例如：times = 3，输出 1，2，3以及对应的面积
		//（4）在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
		//
		//radius 半径     circumference 周长     area 面积
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入Times");
		int times = myScanner.nextInt();
		
		Circle c = new Circle();
		PassObject p = new PassObject();

		if(times < 1){
			System.out.println("输入值小于1，请重新输入");
		} else{
			System.out.println("Radius" + "\t" + "Area");
			p.printAreas(c, times);
		}
	}
}

class Circle{

	double radius;

	public double findArea(double radius){
		this.radius = radius;
		System.out.print(this.radius + "\t");
		return 3.1415926535 * this.radius * this.radius;
	}
}

class PassObject{

	public void printAreas(Circle c, int times){
		for(int i = 1; i <= times; i++){
			System.out.println(c.findArea(i));
		}
	}
}