import java.util.Scanner;

public class MethodExercise01{

	//编写一个 main 方法
	public static void main(String[] args){

		//编写类AA 有一个方法，判断一个数是偶数还是奇数，返回boolean
		AA a = new AA();
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入判断的数字：");
		int numble = myScanner.nextInt();
		if(a.odd(numble)){
			System.out.println("该数是偶数");
		} else{
			System.out.println("该数是奇数");
		}


		//根据行，列，字符 打印对应行数和列数的字符
		//字符是#
		System.out.print("行数：");
		int line = myScanner.nextInt();
		System.out.print("列数：");
		int list = myScanner.nextInt();
		a.print(line, list);
	}
}

class AA{

	public boolean odd(int numble){

		boolean judge = false;
		if(numble % 2 == 0){
			judge = true;
		}
		return judge;
	}

	public void print(int line, int list){
		
		for(int i = 0; i < line; i++){//输出对应行列数的符号#
			for(int j = 0; j < list; j++){
				System.out.print('#');
			}
			System.out.println();
		}
	}
}

