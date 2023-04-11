import java.util.Scanner;

public class MiGong{

	//定义一个 main 方法
	public static void main(String[] args){

		//迷宫问题
		//思路：
		//1.初始化迷宫
		//2.传入形参 迷宫数组，当前位置，终点位置 到searchRoad中
		//3.searchRoad中，以下、右、左、上的顺序寻路，若下一个位置为0，则可以前进，并在前进后将该位置标为1
		//4.若下一个位置是终点，输出寻路成功并退出程序
		int[][] miGong = {{1, 1, 1, 1, 1, 1, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 1, 1, 0, 0, 0, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 1, 1, 1, 1, 1, 1}};
		int[] location = {2, 1};//起点位置
		int[] destination = {5, 1};//终点位置

		// int[] location = {1, 1};//起点位置
		// int[] destination = {4, 3};//终点位置
		// System.out.println("==迷宫==");
		// for(int i = 0; i < miGong.length; i++){
		// 	for(int j = 0; j < miGong[i].length; j++){
		// 		System.out.print(miGong[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		// System.out.println("起点坐标是:2行2列");
		// System.out.println("终点坐标是:5行4列");
		// MyTools tool = new MyTools();
		// tool.searchRoad(location, destination, miGong);
		// System.out.println("==找到路后的迷宫==");
		// for(int i = 0; i < miGong.length; i++){
		// 	for(int j = 0; j < miGong[i].length; j++){
		// 		System.out.print(miGong[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		
		//打印迷宫
		System.out.println("==寻路前的迷宫==");
		for(int i = 0; i < miGong.length; i++){
			for(int j = 0; j < miGong[i].length; j++){
				System.out.print(miGong[i][j] + " ");
			}
			System.out.println();
		}
		MyTools tool = new MyTools();
		tool.findWay(location[0], location[1], miGong);
		//打印寻路后的迷宫
		System.out.println("==找到路后的迷宫==");
		for(int i = 0; i < miGong.length; i++){
			for(int j = 0; j < miGong[i].length; j++){
				System.out.print(miGong[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class MyTools{

	/*
	该方法有着严重的缺陷，遇到地图中存在有回路的死路，而出路在回路旁时，会有概率出现寻路失败的情况
	所以要设计一种在探路失败时，将以探索的路径进行标记并能回到 寻路原点的方法，用递归
	
	public void searchRoad(int[] location, int[] destination, int[][] miGong){
		
		//以下右上左的顺序进行寻找
		//判断当前位置是否为终点
		
		if(location[0] == destination[0] && location[1] == destination[1]){//&& 和 || 别再搞混了！
			System.out.println("已到达终点，退出程序");
		} else if(miGong[ location[0] + 1 ][ location[1] ] == 0){//向下找
			System.out.println("向下走");
			miGong[ location[0] + 1 ][ location[1] ] = 2;
			location[0]++;
			searchRoad(location, destination, miGong);
		} else if(miGong[ location[0] ][ location[1] + 1 ] == 0){//向右找
			System.out.println("向右走");
			miGong[ location[0] ][ location[1] + 1 ] = 2;
			location[1]++;
			searchRoad(location, destination, miGong);
		} else if(miGong[ location[0] - 1 ][ location[1] ] == 0){//向上找
			System.out.println("向上走");
			miGong[ location[0] - 1 ][ location[1] ] = 2;
			location[0]--;
			searchRoad(location, destination, miGong);
		} else if(miGong[ location[0] ][ location[1] - 1 ] == 0){//向左找
			System.out.println("向左走");
			miGong[ location[0] ][ location[1] - 1 ] = 2;
			location[1]--;
			searchRoad(location, destination, miGong);
		} else{
			System.out.println("没有可通往终点的路");
		}
		
	}*/

	/*
	没走过的地方为0，墙壁为1，经过且能走通的路为2，死路为3
	1.在每一次方法调用时检查终点位置是否已标记为通路,如果已到终点，
	2.检查当前位置是否为0，是就进行下一步的探索，不是则返回false
	3.若当前位置为0，将此位置标记为2，然后进行下一次探索
	4.每一次探索的顺序是下右上左，若某次探索的结果为true，则在该探索结果下进行下一步探索
	5.如果四次探索均为false，则标记该点为死路并返回false
	6.输出探索完成的图
	 */
	public boolean findWay(int i, int j, int[][] miGong){
		if(miGong[5][1] == 2){
			return true;//寻到终点后，逐级往上返回true
		} else if(miGong[i][j] == 0){
			miGong[i][j] = 2;
			if(findWay(i + 1, j, miGong)){//向下探索
				return true;
			} else if(findWay(i, j + 1, miGong)){//向右探索
				return true;
			} else if(findWay(i - 1, j, miGong)){//向上探索
				return true;
			} else if(findWay(i, j - 1, miGong)){//向左探索
				return true;
			} else{//若四个方向都无路
				miGong[i][j] = 3;
				return false;
			}
		} else{
			return false;
		}
	}
}