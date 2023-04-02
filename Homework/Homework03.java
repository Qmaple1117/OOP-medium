public class Homework03{

	public static void main(String[] args){

		/*
		输出结果
		 */
		int num = 1;
		while(num < 10){
			System.out.println(num);
			if(num > 5){
				break;
			}
			num += 2;
		}
		/*
		结果是
		1
		3
		5
		7
		 */
	}
}