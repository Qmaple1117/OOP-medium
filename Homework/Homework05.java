public class Homework05{

	public static void main(String[] args){

		//随机生成十个数 1~100  ，保存到数组，并倒叙打印以及求平均值，
		//求最大值以及下标，并查找里面是否有 8 
		//思路：
		//（1）用(int)(Math.random()*100) + 1 生成1~100的随机数，Math.random()随机生成0~1的double数
		//（2）定义一个int[] arr = new int[10];并用for循环保存随机数到arr
		//（3）定义int sum = 0,max = 0,maxIndex = 0;double average = 0;
		//（4）定义寻找的数elem变量 = 8，for循环一次比对一次，比对成功就令elem = 1
		//（5）先死后活
		//
		int[] arr = new int[10];
		int sum = 0,max = 0,maxIndex = 0;//定义和，最大值，最大值下标的变量
		double average = 0;//定义平均值变量
		int elem = 8;//待寻找的数
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100) + 1;
			sum += arr[i];
			if(arr[i] > max){//更新最大值及其下标
				max = arr[i];
				maxIndex = i;
			}
			if(arr[i] == elem){//若找到8则标记
				elem = 1;
			}
		}
		average = 1.0 * sum / arr.length;
		for(int i = 0; i < arr.length; i++){//打印初始数组
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n===数组倒序输出===");
		for(int i = arr.length - 1; i >= 0; i--){//打印倒序数组
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n平均值是：" + average);
		System.out.println("最大值是：" + max +" 其下标为：" + maxIndex);
		if(elem == 1){
			System.out.println("数组元素里有8");
		} else{
			System.out.println("数组元素里没有8");
		}
	}
}