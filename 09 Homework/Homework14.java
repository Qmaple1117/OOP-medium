import java.util.Scanner;

public class Homework14{

	//编写一个main方法
	public static void main(String[] args){

		//有个人Tom设计他的成员变量.成员方法，可以电脑猜拳
		//电脑每次都会随机生成0，1，2
		//0 表示石头，1 表示剪刀，2 表示布
		//并要可以显示Tom的输赢次数
		
		//思路：
		//1.生成随机数可以用 random()，会返回double的0~1的随机数
		//	(int)(Math.random()*100) + 1 可以生成1~100的随机数
		//	(int)(Math.random()*100) *3 + 2 可以生成 1 ~ 299的随机数
		//	所以，定义int var =  ((int)(Math.random()*100) *3 + 2)/100 就可以得到随机生成
		//	0，1，2的随机变量
		//2.然后每次询问是否继续游戏
		
		Scanner myScanner = new Scanner(System.in);
		Tool14 t = new Tool14();

		t.guseeFist(myScanner);
	}
}

class Tool14{

	public void guseeFist(Scanner myScanner){

		int playerTimes = 0, comTimes = 0, noWin = 0;
		String choice = " ";
		do{
			System.out.println("请选择：0是石头，1是剪刀，2是布");
			int player = myScanner.nextInt();
			int computer = ((int)(Math.random()*100) * 3 + 2) / 100;
			System.out.println("电脑的选择是：" + computer);
			if((player == 0 && computer == 1) || (player == 1 && computer == 2) 
				|| (player == 2 && computer == 0)){

				System.out.println("Tom赢");
				playerTimes++;//玩家赢

			} else if((player == 1 && computer == 0) || (player == 2 && computer == 1) 
				|| (player == 0 && computer == 2)){

				System.out.println("电脑赢");
				comTimes++;//电脑赢

			} else{
				System.out.println("平局");
				noWin++;//平局
			}

			System.out.println("是否继续：y/n");
			choice = myScanner.next();
		} while("y".equals(choice));
		System.out.println("Tom赢的次数为：" + playerTimes + "\n" 
				 		   + "电脑赢的次数为：" + comTimes + "\n" 
				 		   + "平局的次数为：" + noWin);

	}
}