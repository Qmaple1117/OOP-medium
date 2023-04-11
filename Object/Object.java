import java.util.Scanner;

public class Object{

	public static void main(String[] args){

		//以现有的知识解决
		//张老太养了两只猫猫:一只名字叫小白,今年 3 岁,白色。还有一只叫小花,今年 100 岁,花色。
		//请编写一个程序，当用户输入小猫的名字时，就显示该猫的名字，年龄，颜色。
		//如果用户输入的小猫名错误，则显示 张老太没有这只猫猫
		Scanner myScanner = new Scanner(System.in);
		String bai = "小白", hua = "小花";
		System.out.print("请输入小猫的名字：");
		String name = myScanner.next();
		if(name.equals(bai)){
			System.out.println("猫的名字是小白，年龄为3岁，颜色为白色");
		} else if(name.equals(hua)){
			System.out.println("猫的名字是小花，年龄为100岁，颜色为花色");
		} else{
			System.out.println("张老太没有这只猫猫");
		}
	}
}