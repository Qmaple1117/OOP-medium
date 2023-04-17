//看看下列代码会输出什么


public class Homework08{

	int count = 9;
	public void count1(){
		count = 10;
		System.out.println("count1 = " + count);
	}

	public void count2(){
		System.out.println("count2 = " + count++);
	}

	public static void main(String args[]){
		
		//1.  new Homework08()是匿名对象，只能用一次（因为没有变量储存它的地址）
		//2.  new Homework08().count1();创建匿名对象后立即调用count1 方法
		new Homework08().count1();
		Homework08 t1 = new Homework08();
		t1.count2();
		t1.count2();
	}
}