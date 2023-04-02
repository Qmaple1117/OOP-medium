import java.util.Scanner;

public class ArrayReduce{

	public static void main(String[] args){

		//要求：实现数组删减元素效果，实现对数组缩减。ArrayReduce.java
		// int[] arr = {1,2,3,4,5}
		// 每次缩减最后的元素，缩减后询问用户是否继续缩减，并在只剩一个时提示无法继续删减
		//
		int[] arr = {1, 2, 3, 4, 5};//初始化数组
		Scanner myScanner = new Scanner(System.in);//定义一个Scanner对象接收用户的输入
		System.out.println("数组的初始元素为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(;;){
			int[] newArr = new int[arr.length - 1];
			for(int i = 0; i < newArr.length; i++){
					newArr[i] = arr[i];
			}
			arr = newArr;//将原数组的地址迁移至新数组处
			System.out.println("删减成功");
			for(int i = 0; i < arr.length; i++){//便利输出新的arr数组
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("是否继续删减：y/n  ");
			char choice = myScanner.next().charAt(0);
			if(choice != 'y'){//可更细化条件，实现程序的健壮性
				break;
			}
			if(arr.length == 1){
				System.out.println("数组只剩一个元素，无法继续删减。");
				break;
			}
		}
		System.out.println("退出。。。");
	}
}