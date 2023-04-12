
public class Recursion{

	//编写一个 main 方法
	public static void main(String[] args){

		//编写一个阶乘方法
		MyTools tool = new MyTools();
		System.out.println(tool.factorial(5));
	}
}

class MyTools{

	public int factorial(int a){
		if(a > 1){
			return factorial(a - 1) * a;
		} else{
			return 1;
		}
	}
}