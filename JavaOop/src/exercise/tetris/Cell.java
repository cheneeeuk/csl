package exercise.tetris;

public class Cell {
	private int row;//定义行
	private int col;//定义列
	public static final int DISTANCE = 10;//控制移动的距离
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	//下落方法 格子下落增加一行
	public void drop(){
		this.row += DISTANCE;
	}
	//带参下落
	public void drop(int d){
		this.row += d*DISTANCE;
	}
	//左移方法 需传入移动的列数
	public void moveLeft(int d){
		this.col -= d*DISTANCE;
	}
	//左移一列
	public void moveLeft(){
		this.col -= DISTANCE;
	}
	//无参右移
	public void moveRight(){
		this.col += DISTANCE;
	}
	//带参右移
	public void moveRight(int d){
		this.col += d*DISTANCE;
	}
	
	
	
	
	//打印格子的位置信息
	public String getCellInfo(){
		return row + "," + col;
	}
	public Cell(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	public Cell() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
