/*
使用二维数组打印一个 10 行杨辉三角形

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 1

思路：
（1）第 i 行有 i 个数
（2）每一行的第一个数和最后一个数都是1
（3）其他的数规律是：arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
（4）先定义一个有10个元素的二维数组，之后再为一维数组开辟空间
（5）先死后活，定义一个Scanner对象，接收杨辉三角的行数
 */
import java.util.Scanner;

public class YangHuiSanJiao{

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入输出杨辉三角的行数：");
		int numble = myScanner.nextInt();
		int[][] arr = new int[numble][];
		for(int i = 0; i < arr.length; i++){
			//给一维数组开辟空间
			arr[i] = new int[i + 1];
			for(int j = 0; j < arr[i].length; j++){
				if(j == 0 || j == i){//如果当前位置是该一维数组的头或尾，赋1
					arr[i][j] = 1;
				} else{
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){//遍历输出每一个一维数组的值
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();//换行
		}
	}
}