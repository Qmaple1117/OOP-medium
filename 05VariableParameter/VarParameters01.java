
public class VarParameters01{

	//编写一个main方法
	public static void main(String[] args){

		//类 HspMethod 编写一个方法sum  可以计算两个数的和，三个数的和，四个。。。
		
		HspMethod method = new HspMethod();
		System.out.println(method.sum(25, 20));
		System.out.println(method.sum(25, 20, 10));
	}
}

class HspMethod{

	//1.   int...表示接收的是int 类型的可变参数，数量（0~n）
	//2.   可以将 nums 视为数组，用的时候和数组一样用即可
	public int sum(int... nums){
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		return res;
	}
}