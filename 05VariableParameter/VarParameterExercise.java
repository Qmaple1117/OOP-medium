
public class VarParameterExercise{

	//编写一个main方法
	public static void main(String[] args){

		//有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），
		//返回姓名和五门课成绩（总分）。封装成一个可变参数的方法
		
		MyMethod m = new MyMethod();
		System.out.println(m.showScore("Qmaple", 20, 30));
		System.out.println(m.showScore("Qmaple", 20, 30, 50));
		System.out.println(m.showScore("Qmaple", 20, 30, 50, 70));
	}
}

class MyMethod{

	public String showScore(String name, double... scores){
		double res = 0;
		for(int i = 0; i < scores.length; i++){
			res += scores[i];
		}
		//复习一个知识点： + 两旁为数值时，进行运算操作
		//                + 两旁有一边为字符串时，执行拼接操作
		return name + " " + scores.length + "门课的总分为：" + res;
	}
}