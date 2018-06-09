package exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame {
	public MyFrame() {
		T t = new T(100,100);
		MyPanel mp = new MyPanel(t);
		this.add(mp);
		this.addKeyListener(mp);
		this.setSize(300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		MyFrame tt = new MyFrame();
	}
}

class MyPanel extends JPanel implements KeyListener {
	int x = 10;
	int y = 10;
	T t;
	//构造墙体
	Wall wall = new Wall(300,400);
	public MyPanel() {

	}
	public MyPanel(T t){
		this.t = t;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.blue);
		//打印墙

		boolean[][] boo = wall.getWall();
		//构造方块
		Cell[] cells = t.getCells();
		//将方块入墙
		for(int i=0;i<cells.length;i++){
			//行cells[i].getRow() --> 墙体纵坐标
			//列cells[i].getCol() --> 墙体横坐标
			boo[cells[i].getCol()][cells[i].getRow()] = true;
		}
		//打印墙
		for(int i=0;i<boo.length;i++){
			for(int j=0;j<boo[i].length;j++){
				if(boo[i][j]){
					g.draw3DRect(i,j,10,10,true);
				}
			}
		}
		//方块出墙
		for(int i=0;i<cells.length;i++){
			//行cells[i].getRow() --> 墙体纵坐标
			//列cells[i].getCol() --> 墙体横坐标
			boo[cells[i].getCol()][cells[i].getRow()] = false;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_DOWN){//点击向下的键  
			t.drop();
			Cell[] cells = this.t.getCells();
			int row = cells[1].getRow();
			if(row == 400 - 10){
				boolean[][] boo = wall.getWall();
				for(int i=0;i<cells.length;i++){
					//将方块入墙
					//行cells[i].getRow() --> 墙体纵坐标
					//列cells[i].getCol() --> 墙体横坐标
					boo[cells[i].getCol()][cells[i].getRow()] = true;
				}
				T t = new T(200,200);
				this.t = t;
				this.repaint();
			}else{
				this.repaint();
			}
        }else if(e.getKeyCode()==KeyEvent.VK_UP){//点击向上的键
        	//翻转
        	t.roll();
        	this.repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){//点击向左的键  
        	t.moveLeft();
        	this.repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){//点击向右的键  
        	t.moveRight();
        	this.repaint();
        }  
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
