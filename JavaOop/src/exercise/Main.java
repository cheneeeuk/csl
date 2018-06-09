package exercise;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		int[] i = new int[11];
		//����ǽ
		Wall wall = new Wall(10,20);
		//�������
		T t = new T(3,3);
		Scanner s = new Scanner(System.in);
		System.out.println("1---����,2---����,3---����,0---�˳�");
		paint(wall,t);
		int control = s.nextInt();
		while(control != 0){
			if(control>3 || control<1){
				System.out.println("������������������");
				control = s.nextInt();
				continue;
			}else{
				switch(control){
					case 1:t.drop();break;
					case 2:t.moveLeft();break;
					case 3:t.moveRight();break;
				}
				paint(wall,t);
				control = s.nextInt();
				continue;
			}
		}
		System.out.println("��Ϸ����!");
	}
	public static void paint(Wall wall,T t){
		//��ȡǽ�Ŀ��
		int height = wall.getHeight();
		int width = wall.getWidth();
		for(int i=0;i<height;i++){//��Ӧrow
			for(int j=0;j<width;j++){//��Ӧcol
				boolean b = true;
				//��ӡ��������
				for(int k=0;k<t.getCells().length;k++){
					Cell[] cells = t.getCells();
					if(i==cells[k].getRow() && j==cells[k].getCol()){
						System.out.print("* ");
						b = false;
					}
				}
				if(b){
					System.out.print("- ");	
				}
			}
			System.out.println();
		}
	}
}






