
public class OverLoadExercise{

	//定义一个 main 方法
	public static void main(String[] args){

		//在类Methods中定义三个重载方法并调用，方法名为m
		//分别接受，int     int，int     字符串
		//并分别输出  平方结果    相乘结果    字符串内容
		
		Methods cal = new Methods();
		cal.m(5);
		cal.m(5, 6);
		cal.m("普罗米");

		//在类Methods中定义三个重载方法并调用，方法名为max
		//分别接受，int,int     double,double     double,double,double
		//返回最大值
		System.out.println(cal.max(2, 3));
		System.out.println(cal.max(2.5, 2.6));
		System.out.println(cal.max(2.5, 2.63, 2.6));

	}
}

class Methods{

	public void m(int n1){
		System.out.println(n1 * n1);
	}
	public void m(int n1, int n2){
		System.out.println(n1 * n2);
	}
	public void m(String n1){
		System.out.println(n1);
	}

	public int max(int n1, int n2){
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2){
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2, double n3){
		if(n1 >= n2 && n1 >= n3){
			return n1;
		} else if(n2 >= n1 && n2 >= n3){
			return n2;
		} else{
			return n3;
		}
	}
}