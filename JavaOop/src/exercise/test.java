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
		if(e.getKeyCode()==KeyEvent.VK_DOWN){//������µļ�  
			t.drop();
			this.repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_UP){//������ϵļ�  
        	//��ת
        	t.roll();
        	this.repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){//�������ļ�  
        	t.moveLeft();
        	this.repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){//������ҵļ�  
        	t.moveRight();
        	this.repaint();
        }  
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
