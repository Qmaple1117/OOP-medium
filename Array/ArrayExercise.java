
public class ArrayExercise{

	public static void main(String[] args){

		char[] letter = new char[26];
		char j = 'A' + 2;         //在byte，short，char进行计算时，计算机会首先将他们转换为int类型
								//所以，不可以用char letter[i] = j + i;
		for(int i = 0; i < letter.length; i++){//存入剩余的25个元素
			letter[i] = j;
			j++;
		}
		for(int i = 0; i < letter.length; i++){
			System.out.print(letter[i] + " ");//输出所有的元素
		}
	}
}