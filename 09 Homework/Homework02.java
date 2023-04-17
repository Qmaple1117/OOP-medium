
public class Homework02{

	//编写一个 main 方法
	public static void main(String[] args){

		//方法find，实现查找某字符串是否在字符串数组中，并返回返回索引，如果找不到，返回-1
		String[] arr = {"1.1", "2.5", "1.0", "5.6", "5.4"};
		Tool02 t = new Tool02();

		System.out.println("寻找 2.6");
		int find = t.find("2.6", arr);
		if(find == -1){
			System.out.println("没找到");
		} else{
			System.out.println("该字符串下标为：" + find);
		}

		System.out.println("寻找 5.4");
		int find02 = t.find("5.4", arr);
		if(find02 == -1){
			System.out.println("没找到");
		} else{
			System.out.println("该字符串下标为：" + find02);
		}
	}
}

class Tool02{

	public int find(String name, String[] s){
		
		int find = -1;
		for(int i = 0; i < s.length; i++){
			if(name.equals(s[i])){
				find = i;
				break;
			}
		}
		return find;
	}
}