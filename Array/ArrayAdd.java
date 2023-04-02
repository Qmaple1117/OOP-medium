import java.util.Scanner;

public class ArrayAdd{

	public static void main(String[] args){

		//要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
		// 1) 原始数组使用静态分配 int[] arr = {1,2,3}
		// 2) 增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
		// 3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
		//思路：
		//（1）定义一个Scanner对象，接收要增加的数组元素
		//（2）新增一个数组，最后将原数组链接到新增数组
		//（3）使用for无限循环，每一次循环结束询问是否继续添加
		//
		int[] arr = {1, 2, 3};//初始化数组
		Scanner myScanner = new Scanner(System.in);
		for(;;){
			System.out.print("添加的整数为：");
			int elem = myScanner.nextInt();
			int[] newArr = new int[arr.length + 1];
			for(int i = 0; i < newArr.length; i++){
				if(i == newArr.length - 1){
					newArr[i] = elem;//将新元素添加至数组末尾
				} else{
					newArr[i] = arr[i];
				}
			}
			arr = newArr;//将原数组的地址迁移至新数组处
			System.out.println("添加成功");
			for(int i = 0; i < arr.length; i++){//便利输出新的arr数组
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("是否继续添加：y/n  ");
			char choice = myScanner.next().charAt(0);
			if(choice != 'y'){//可更细化条件，实现程序的健壮性
				break;
			}
		}
		System.out.println("退出。。。");
	}
}