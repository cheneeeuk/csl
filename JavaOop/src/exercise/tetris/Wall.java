package exercise.tetris;

public class Wall {
	private boolean[][] wall;
	private int width;//©М
	private int height;//ап

	public boolean[][] getWall() {
		return wall;
	}

	public void setWall(boolean[][] wall) {
		this.wall = wall;
	}

	public int getWidth() {

		return width;
	}
	public void setWidth(int width) {

		this.width = width;
	}
	public int getHeight() {

		return height;
	}
	public void setHeight(int height) {

		this.height = height;
	}


	public Wall(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.wall = new boolean[width][height];
	}
	public Wall() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
