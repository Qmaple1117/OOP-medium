import java.util.Scanner;

public class HanoiTower{

	//定义一个 main 方法
	public static void main(String[] args){

		//汉诺塔问题
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入汉诺塔的层数：");
		int num = myScanner.nextInt();//圆片的数量
		char a = 'A';//起点
		char b = 'B';//中转站
		char c = 'C';//终点

		Tower way = new Tower();
		way.move(num, a, b, c);
	}
}

class Tower{

	/*
	设计一个能解决汉诺塔的方法，柱子分为a，b，c 三个
	思路：
	1.只有一层时，a -> c
	2.大于等于两层时，将底层圆片视为 下层，其余圆片是为 上层
	3.先将上层圆片移入b，下层圆片移入c，再将存在于 b 的上层原片移入 c
	4.方法中的形参，为整体圆片的数量，起点，转乘点，终点
	5.如果上层圆片数量大于 1，方法递归调用
	 */
	
	// a 代表当前的起点，b 代表当前移动圆片需要的中转站，c 代表当前转移的终点
	public void move(int num, char a, char b, char c){
		if(num == 1){
			System.out.println(a + "->" + c);
		} else{
			move(num - 1, a, c, b);//将上层圆片移至b
			System.out.println(a + "->" + c);//将底层圆片移至c
			//上层圆片目前处于 b，将剩余的圆片分为上下两层分别转移至c
			move(num - 1, b, a, c);
		}
	}
}