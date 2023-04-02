

public class BubbleSort{

	public static void main(String[] args){

		//我们将五个无序：24,69,80,57,13 使用冒泡排序法将其
		//排成一个从小到大的有序数列。
		//思路：   数组大小length
		//（1）排序共有 length-1 轮
		//（2）第 i 轮需要进行 length-i 次
		//（3）定义前指针与后指针，每一次满足条件后交换arr[前指针]与arr[后指针]，且前后各++
		//     [可以更简洁，用 j 和 j+1 代替前后指针，还可以省略每一轮之后的初始化]
		//（4）每一轮结束前需要把指针初始化
		//（5）需要两层循环
		//
		int[] arr = {24, 69, 80, 57, 13};
		int length = arr.length;
		System.out.println("===数组排序前===");
		for(int i = 0; i < length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		int front = 0, behind = 1;//定义前指针与后指针
		for(int i = 0; i < length - 1; i++){//共排序 length-1 轮
			int temp = 0;
			for(int j = 1; j < length - i; j++){//第 i 轮交换
				//满足条件，大的向后移
				if(arr[front] > arr[behind]){
					temp = arr[front];
					arr[front] = arr[behind];
					arr[behind] = temp;
				}
				front++;
				behind++;
			}
			front = 0;behind = 1;//初始化指针
		}
		System.out.println("===数组排序后===");
		for(int i = 0; i < length; i++){
			System.out.print(arr[i] + "\t");
		}
	}
}