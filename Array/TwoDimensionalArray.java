import java.util.Scanner;

public class TwoDimensionalArray{

	public static void main(String[] args){

		// 请用二维数组输出如下图形
		// 0 0 0 0 0 0
		// 0 0 1 0 0 0
		// 0 2 0 3 0 0
		// 0 0 0 0 0 0
		// 
		Scanner myScanner = new Scanner(System.in);
		int[][] arr = {{0, 0, 0, 0, 0, 0},
					   {0, 0, 1, 0, 0, 0},
					   {0, 2, 0, 3, 0, 0},
					   {0, 0, 0, 0, 0, 0}};
		//输出二维数组中的每一个元素
		for(int i = 0; i < arr.length; i++){
			//arr[i].length表示二维数组中第 i+1 个元素的长度，因为二维数组的元素是一维数组
			//输出一维数组中的每一个元素
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();//换行
		}
	}
}