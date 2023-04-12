
public class OverLoad01{

	//定义一个 main 方法
	public static void main(String[] args){

		//方法重载示例
		//方法重载：同一类中的方法可以同名，但前提是每一个的形参都不同
		MyCalculator cal = new MyCalculator();
		System.out.println(cal.calculator(1, 2));
		System.out.println(cal.calculator(1, 2.0));
		System.out.println(cal.calculator(1.1, 2));
		System.out.println(cal.calculator(1, 2, 3));
	}
}

class MyCalculator{

	public int calculator(int n1, int n2){//两个int的和
		return n1 + n2;
	}
	public double calculator(int n1, double n2){//一个int，一个double的和
		return n1 + n2;
	}
	public double calculator(double n1, int n2){//一个double，一个int的和
		return n1 + n2;
	}
	public int calculator(int n1, int n2, int n3){//三个int的和
		return n1 + n2 + n3;
	}
}