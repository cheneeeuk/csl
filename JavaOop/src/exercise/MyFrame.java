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
	//����ǽ��
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
		//��ӡǽ

		boolean[][] boo = wall.getWall();
		//���췽��
		Cell[] cells = t.getCells();
		//��������ǽ
		for(int i=0;i<cells.length;i++){
			//��cells[i].getRow() --> ǽ��������
			//��cells[i].getCol() --> ǽ�������
			boo[cells[i].getCol()][cells[i].getRow()] = true;
		}
		//��ӡǽ
		for(int i=0;i<boo.length;i++){
			for(int j=0;j<boo[i].length;j++){
				if(boo[i][j]){
					g.draw3DRect(i,j,10,10,true);
				}
			}
		}
		//�����ǽ
		for(int i=0;i<cells.length;i++){
			//��cells[i].getRow() --> ǽ��������
			//��cells[i].getCol() --> ǽ�������
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
		if(e.getKeyCode()==KeyEvent.VK_DOWN){//������µļ�  
			t.drop();
			Cell[] cells = this.t.getCells();
			int row = cells[1].getRow();
			if(row == 400 - 10){
				boolean[][] boo = wall.getWall();
				for(int i=0;i<cells.length;i++){
					//��������ǽ
					//��cells[i].getRow() --> ǽ��������
					//��cells[i].getCol() --> ǽ�������
					boo[cells[i].getCol()][cells[i].getRow()] = true;
				}
				T t = new T(200,200);
				this.t = t;
				this.repaint();
			}else{
				this.repaint();
			}
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
