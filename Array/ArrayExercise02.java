public class ArrayExercise02{

	public static void main(String[] args){

		//求出一个数组 int[]的最大值 { 4, -1, 9, 10, 23 }，并得到对应的下标
		//思路：
		//（1）定义一个int数组存储相应的数值
		//（2）假设 max 是 a[0]
		//（3）用for循环遍历数组，如果当前元素大于max，max更新，并保存下标
		int[] a = { 4, -1, 9, 10, 23 };
		int max = a[0];
		int index = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
				index = i;
			}
		}
		System.out.println("最大值是：" + max + " 对应的下标是" + index);
	}
}