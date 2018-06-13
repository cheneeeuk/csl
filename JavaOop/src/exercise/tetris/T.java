package exercise.tetris;

import exercise.tetris.Cell;

public class T {
	
	private Cell[] cells = new Cell[4];
	
	private static int rollNumber = 0;
	
	public T(){
		
	}
	public Cell[] getCells() {
		return cells;
	}
	public void setCells(Cell[] cells) {
		this.cells = cells;
	}
	public T(int i,int j){
		cells[0] = new Cell(i,j);
		cells[1] = new Cell(i,j+Cell.DISTANCE);
		cells[2] = new Cell(i,j+2*Cell.DISTANCE);
		cells[3] = new Cell(i+Cell.DISTANCE,j+Cell.DISTANCE);
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
	//翻转
	public void roll(){
		//顺时针翻转
		if(rollNumber%4 == 0){
			//4-->1
			cells[0].setRow(cells[0].getRow()-Cell.DISTANCE);
			cells[0].setCol(cells[0].getCol()+Cell.DISTANCE);
			
			cells[2].setRow(cells[2].getRow()+Cell.DISTANCE);
			cells[2].setCol(cells[2].getCol()-Cell.DISTANCE);
			
			cells[3].setRow(cells[3].getRow()-Cell.DISTANCE);
			cells[3].setCol(cells[3].getCol()-Cell.DISTANCE);
		}else if(rollNumber%4 == 1){
			//1-->2
			cells[0].setRow(cells[0].getRow()+Cell.DISTANCE);
			cells[0].setCol(cells[0].getCol()+Cell.DISTANCE);
					
			cells[2].setRow(cells[2].getRow()-Cell.DISTANCE);
			cells[2].setCol(cells[2].getCol()-Cell.DISTANCE);
					
			cells[3].setRow(cells[3].getRow()-Cell.DISTANCE);
			cells[3].setCol(cells[3].getCol()+Cell.DISTANCE);
		}else if(rollNumber%4 == 2){
			//2-->3
			cells[0].setRow(cells[0].getRow()+Cell.DISTANCE);
			cells[0].setCol(cells[0].getCol()-Cell.DISTANCE);
							
			cells[2].setRow(cells[2].getRow()-Cell.DISTANCE);
			cells[2].setCol(cells[2].getCol()+Cell.DISTANCE);
							
			cells[3].setRow(cells[3].getRow()+Cell.DISTANCE);
			cells[3].setCol(cells[3].getCol()+Cell.DISTANCE);
		}else if(rollNumber%4 == 3){
			//3-->4
			cells[0].setRow(cells[0].getRow()-Cell.DISTANCE);
			cells[0].setCol(cells[0].getCol()-Cell.DISTANCE);
							
			cells[2].setRow(cells[2].getRow()+Cell.DISTANCE);
			cells[2].setCol(cells[2].getCol()+Cell.DISTANCE);
							
			cells[3].setRow(cells[3].getRow()+Cell.DISTANCE);
			cells[3].setCol(cells[3].getCol()-Cell.DISTANCE);
		}
		rollNumber++;
	}
}
