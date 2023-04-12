
public class EightQueens{

	//定义一个 main 方法
	public static void main(String[] args){

		//8皇后问题
		//8*8的棋盘内，任意摆放 8 个皇后，其不能相互攻击，
		//即：任意两个皇后都不能处于同一行、同一列或同一斜线上

		//定义一个棋盘并初始化
		int[][] chessBoard = new int[8][8];
		for(int i = 0; i < chessBoard.length; i++){
			for(int j = 0; j < chessBoard[i].length; j++){
				chessBoard[i][j] = 0;
			}
		}
		//定义一个一维数组保存方法种类个数
		int[] sum = {0};
		//创建对象并调用方法
		Queen queens = new Queen();
		queens.notDie(chessBoard, 0, sum);

		//输出共有多少种摆放方法
		System.out.println("共有" + sum[0] + "种摆放方法");
	}
}

class Queen{

	//首先定义一个方法，返回值为boolean类型
	//传入的形参为方法种类个数num、棋盘chessBoard、当前摆放女王的行数
	/*
	思路：
	1.无女王用 0 表示，有女王用 5 表示
	2.每一次放置女王前检查当前行数，当row > 7，表示8个女王已经放置完毕，sum++并return true
	3.若row <= 7,标记当前点位为女王，检查当前列，当前斜线是否有第二个女王，
	  有则初始化点位值并跳过该列，去检索下一列
	4.若无第二个女王,前往下一行
	5.若下一行全部无法放置，将上一行标记为女王的点位初始化
	6.因为每一行需要检查8列所以用for循环
	 */
	public boolean notDie(int[][] chessBoard, int row, int[] sum){
		
		if(row > 7){
			sum[0]++;//摆放种类加一
			return true;
		} else{
			//循环遍历该行每一列，看看是否能放置女王
			for(int list = 0; list < chessBoard[row].length; list++){
				chessBoard[row][list] = 5;
				int error = -1;
				//检查当前列有无第二个女王
				for(int i = 0; i < chessBoard.length; i++){
					if(i == row){
						continue;
					} else if(chessBoard[i][list] == 5){
						chessBoard[row][list] = 0;
						error = 1;
						break;
					}
				}
				if(error == 1){//若有女王，跳过本次循环
					continue;
				}
				//检查当前正斜线上方有无第二个女王
				for(int i = row, j = list; i >= 0 && j >= 0; i--, j--){
					if(i == row){
						continue;
					} else if(chessBoard[i][j] == 5){
						chessBoard[row][list] = 0;
						error = 1;
						break;
					}
				}
				if(error == 1){//若有女王，跳过本次循环
					continue;
				}
				//检查当前正斜线下方有无第二个女王
				for(int i = row, j = list; i <= 7 && j <= 7; i++, j++){
					if(i == row){
						continue;
					} else if(chessBoard[i][j] == 5){
						chessBoard[row][list] = 0;
						error = 1;
						break;
					}
				}
				if(error == 1){//若有女王，跳过本次循环
					continue;
				}
				//检查当前反斜线上方有无第二个女王
				for(int i = row, j = list; i >= 0 && j <= 7; i--, j++){
					if(i == row){
						continue;
					} else if(chessBoard[i][j] == 5){
						chessBoard[row][list] = 0;
						error = 1;
						break;
					}
				}
				if(error == 1){//若有女王，跳过本次循环
					continue;
				}
				//检查当前反斜线下方有无第二个女王
				for(int i = row, j = list; i <= 7 && j >= 0; i++, j--){
					if(i == row){
						continue;
					} else if(chessBoard[i][j] == 5){
						chessBoard[row][list] = 0;
						error = 1;
						break;
					}
				}
				if(error == 1){//若有女王，跳过本次循环
					continue;
				}
				if(notDie(chessBoard, row + 1, sum)){//探索下一行
					chessBoard[row][list] = 0;
					//continue;
				} else{
					chessBoard[row][list] = 0;
				}
			}
			return false;
		}
	}
}