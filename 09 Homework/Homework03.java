import java.util.Scanner;

public class Homework03{

	//编写一个 main 方法
	public static void main(String[] args){

		//方法updatePrice，实现更改某本书的价格
		//具体：如果价格大于150，则更改为150，如果价格大于100，则更改为100
		//否则不变
		Scanner myScanner = new Scanner(System.in);
		System.out.print("该书的价格为：");
		double price = myScanner.nextDouble();
		Tool03 t = new Tool03();


		price = t.updatePrice(price);
	}
}

class Tool03{

	public double updatePrice(double price){
		
		if(price > 150){
			System.out.println("书的价格改为150元");
			return 150;
		} else if(price > 100){
			System.out.println("书的价格改为100元");
			return 100;
		} else{
			System.out.println("书的价格不变");
			return price;
		}
	}
}