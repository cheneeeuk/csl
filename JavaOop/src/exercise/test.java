package exercise;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JFrame {
	public test() {
		T t = new T(100,100);
		MyPanel mp = new MyPanel(t);
		this.add(mp);
		this.addKeyListener(mp);
		this.setSize(300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		test tt = new test();
	}
}

class MyPanel extends JPanel implements KeyListener {
	int x = 10;
	int y = 10;
	T t;
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
		
		Cell[] cells = t.getCells();
		
		for(int i=0;i<cells.length;i++){
//			g.fillOval(cells[i].getCol()*10,cells[i].getCol()*10, 10, 10);
//			g.drawString("@", cells[i].getCol(), cells[i].getRow());
			g.draw3DRect(cells[i].getCol(), cells[i].getRow(), 10, 10, true);
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
			this.repaint();
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
