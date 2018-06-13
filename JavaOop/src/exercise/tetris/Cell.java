package exercise.tetris;

public class Cell {
	private int row;//������
	private int col;//������
	public static final int DISTANCE = 10;//�����ƶ��ľ���
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
	//���䷽�� ������������һ��
	public void drop(){
		this.row += DISTANCE;
	}
	//��������
	public void drop(int d){
		this.row += d*DISTANCE;
	}
	//���Ʒ��� �贫���ƶ�������
	public void moveLeft(int d){
		this.col -= d*DISTANCE;
	}
	//����һ��
	public void moveLeft(){
		this.col -= DISTANCE;
	}
	//�޲�����
	public void moveRight(){
		this.col += DISTANCE;
	}
	//��������
	public void moveRight(int d){
		this.col += d*DISTANCE;
	}
	
	
	
	
	//��ӡ���ӵ�λ����Ϣ
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
