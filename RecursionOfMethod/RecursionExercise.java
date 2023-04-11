import java.util.Scanner;

public class RecursionExercise{

	//定义一个 main 方法
	public static void main(String[] args){

		//斐波那契数 1，1，2，3，5，8，13....
		//给一个整数 n ，求前 n 个斐波那契数的和
		//思路：
		//（1）第 i 个数 = 第 i-1 个数 + 第 i-2 个数
		//（2）定义一个返回值类型和形参类型都是 int 的 fibonacci 方法
		//（3）若 n <= 2, 即第一个与第二个值，返回 1；
		//（4）若 n > 2，即第 n 个斐波那契数的值 = fibonacci(n-1) + fibonacci(n-2)
		//（5）定义一个getFibonacciSum 的方法，用for循环求和
		
		// Scanner myScanner = new Scanner(System.in);
		// MyTools tool = new MyTools();
		// System.out.print("输入一个整数n：");
		// int n = myScanner.nextInt();

		// int number = tool.fibonacci(n);
		// System.out.println("第" + n + "个斐波那契数是：" + number);

		// int sum = tool.getFibonacciSum(n);
		// System.out.println("前" + n + "个斐波那契数的和是：" + sum);

		//猴子吃桃，每天吃完一半后再吃一个，
		//吃到第十天（还没吃）只剩了一个，问最开始有几个
		//思路：
		//（1）当天数n = 10 时，桃子的数量numble只剩 1 个
		//（2）第 n-1 天的桃子 = （第 n 天 + 1）* 2
		
		Scanner myScanner = new Scanner(System.in);
		MyTools tool = new MyTools();
		System.out.print("今天是第几天：");
		int n = myScanner.nextInt();
		if(n >= 1){
			int number = tool.getPeachNumble(n);
			System.out.println("最开始的桃子数量：" + number);
		} else{
			System.out.println("应输入大于等于1的数");//缺点：第i天的桃子数量无法得知
		}
	}
}

class MyTools{

	public int fibonacci(int n){

		if(n > 2){//当前数为第三个数或更后面的数时
			return fibonacci(n - 1) + fibonacci(n - 2);
		} else{//当前数是 第一个数或第二个数时
			return 1;
		}

	}

	public int getFibonacciSum(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += fibonacci(i);
		}
		return sum;
	}

	public int getPeachNumble(int n){
		if(n == 1){
			return 1;
		} else{
			return (getPeachNumble(n-1) + 1) * 2;
		}
	}
}