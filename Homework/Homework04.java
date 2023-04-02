public class Homework04{

	public static void main(String[] args){

		/*
		已知有个升序的数组，要求插入一个元素，该数组仍为正序，比如：
		{10, 12, 45, 90}，添加23后，数组为{10, 12, 23, 45, 90}
		 */
		
		int[] arr = {10, 12, 45, 90};
		System.out.println("添加元素前：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int elem = 23;//插入的元素
		int[] newArr = new int[arr.length + 1];
		//将arr中元素转入newArr中
		for(int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}
		//添加元素并保持正序
		for(int i = 0; i < newArr.length; i++){
			int temp = 0;//中间变量
			if(i == newArr.length - 1){//最后一个是空元素，直接插入
				newArr[i] = elem;
			} else if(elem < newArr[i]){
				temp = elem;
				elem = newArr[i];
				newArr[i] = temp;
			}
		}
		arr = newArr;//将arr的地址迁移
		System.out.println("添加后：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}