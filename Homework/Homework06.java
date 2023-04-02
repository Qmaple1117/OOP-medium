public class Homework06{

	public static void main(String[] args){

		//冒泡排序代码
		//思路：
		//==若数组有 n 个元素，则一共要进行 n-1 轮
		//==第 i 轮要进行 n-i 次
		//==嵌套for循环
		//
		int[] arr = {23, 45, 89, 12, 26};
		for(int j = 0; j < arr.length; j++){
			System.out.print(arr[j] + " ");
		}
		System.out.println();//换行
		for(int i = 0; i < arr.length - 1; i++){//共进行 n-1 轮
			for(int j = 0; j < arr.length - i - 1; j++){
				int temp = 0;
				if(arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("第" + (i + 1) + "轮排序后：");
			for(int j = 0; j < arr.length; j++){
				System.out.print(arr[j] + " ");
			}
			System.out.println();//换行
		}
	}
}