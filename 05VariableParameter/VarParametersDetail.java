
public class VarParametersDetail{

	//编写一个main方法
	public static void main(String[] args){

		//细节：
		//1.可变参数的实参数量为 0~n
		//2.可变参数的实参可以是数组
		//3.可变参数的实质就是数组
	}
}

class Detail{

	//4.可变参数 可以和 普通参数 一起放在形参列表，但是 可变参数 必须放在最后
	
	// public int d1(int... nums, double n1){  错误

	// }
	public void d1(double n1, int... nums){//正确
		
	}

	//5.一个形参列表只能存在一个 可变参数
}