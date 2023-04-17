
public class Homework09{

	//编写一个main方法
	public static void main(String[] args){

		//Music类，有音乐名name，音乐时长times属性，
		//并有播放play功能和返回本身属性信息的功能getInfor
		Music m = new Music("大白", 3);
		m.play();
		m.getInfor();


	}
}

class Music{
	String name;
	double times;

	public Music(String name, double times){
		this.name = name;
		this.times = times;
	}

	public void play(){
		System.out.println("正在播放" + this.name);
	}
	public void getInfor(){
		System.out.println("音乐的名字是：" + this.name);
		System.out.println("音乐的时长为：" + this.times + "分钟");
	}
}