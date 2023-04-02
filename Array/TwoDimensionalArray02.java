//二维数组的 使用方式1 和 使用方式2 与一维数组类似
//
//例如：int[][] arr = new int[2][3]        int[][] arr;
//										  arr = new int[][];
//										  

//使用方式3：列数不确定				使用方式4：静态初始化也是和一维数组类似
//动态创建出下列数组
//	1
//	2	2
//	3	3	3
//
public class TwoDimensionalArray02{

	public static void main(String[] args){

		int[][] arr = new int[3][];
		// for(int i = 0; i < arr.length; i++){//如果没有下面的开辟空间，一维数组中的 3 个元素都为null
		// 	System.out.print(arr[i] + " ");
		// }
		for(int i = 0; i < arr.length; i++){
			//给arr中的三个元素开辟空间
			arr[i] = new int[i + 1];
			//给一维数组赋值
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = i + 1;
			}
		}
		for(int i = 0; i < arr.length; i++){//遍历输出
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}