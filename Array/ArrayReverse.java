
public class ArrayReverse{

	public static void main(String[] args){

		//要求：把数组的元素内容反转。 ArrayReverse
		//arr {11,22,33,44,55,66}    --> {66, 55,44,33,22,11}
		//思路：
		//（1）定义两个int变量，head与rear分别保存头部与尾部的数组下标
		//（2）for循环，数组[head]与数组[rear]交换数值，用temp变量保存中间值
		//（3）每一次交换后head++，rear--，循环结束条件为head > rear
		//
		int[] arr = { 11, 22, 33, 44, 55, 66 };
		System.out.println("数组元素为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		int temp = 0;
		int head = 0, rear = arr.length - 1;
		for( ; head < rear; head++, rear--){
			temp = arr[head];
			arr[head] = arr[rear];
			arr[rear] = temp;
		}
		System.out.println();
		System.out.println("改变后的数组元素为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}