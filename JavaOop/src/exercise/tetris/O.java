package exercise.tetris;

import exercise.tetris.Cell;

public class O {
	private Cell[] cells = new Cell[4];
	
	public Cell[] getCells() {
		return cells;
	}
	public void setCells(Cell[] cells) {
		this.cells = cells;
	}
	public O(){
		
	}
	public O(int i,int j){
		cells[0] = new Cell(i,j);
		cells[1] = new Cell(i,j+Cell.DISTANCE);
		cells[2] = new Cell(i+Cell.DISTANCE,j+Cell.DISTANCE);
		cells[3] = new Cell(i+Cell.DISTANCE,j);
	}
	//打印方块
	public void print(){
		for(Cell cell:cells){
			System.out.println(cell.getCellInfo());
		}
	}
	//无参下落
	public void drop(){
		for(int i=0;i<cells.length;i++){
			cells[i].drop();
		}
	}
	//左移
	public void moveLeft(){
		for(int i=0;i<cells.length;i++){
			cells[i].moveLeft();
		}
	}
	//右移
	public void moveRight(){
		for(int i=0;i<cells.length;i++){
			cells[i].moveRight();
		}
	}
}
