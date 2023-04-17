
public class Homework01{

	//编写一个 main 方法
	public static void main(String[] args){

		//方法max，实现求double数组最大值
		// double[] arr = {1.1, 2.5, 1.0, 5.6, 5.4};
		// Tool01 t = new Tool01();
		// System.out.println("double数组中的最大值是：" + t.max(arr));

		//代码有缺陷，缺少健壮性：
		//例如
		//数组为null时与数组为空时 都没有最大值
		
		//修改后的代码
		double[] arr = {1.1, 2.5, 1.0, 5.6, 5.4};
		Tool01 t = new Tool01();
		Double res = t.max(arr);
		if(res != null){
			System.out.println("double数组中的最大值是：" + res);
		} else{
			System.out.println("数组输入有误，不能为null或 空 ");
		}
		
	}
}

/*class Tool01{

	public double max(double[] d){
		
		double max = d[0];
		for(int i = 0; i < d.length; i++){
			max = d[i] > max ? d[i] : max;
		}
		return max;
	}
}*/

//修改后的代码如下：
class Tool01{

	public Double max(double[] d){ //Double是包装类对象，现在还没讲，
		                           //它既可以接收double类型的数，也可以接收null
		
		if(d != null && d.length > 0){
			double max = d[0];
			for(int i = 1; i < d.length; i++){
				max = d[i] > max ? d[i] : max;
			}
			return max;
		} else{
			return null;
		}
	}
}