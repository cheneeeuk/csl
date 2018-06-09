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
		//构造墙
		Wall wall = new Wall(10,20);
		//构造格子
		T t = new T(3,3);
		Scanner s = new Scanner(System.in);
		System.out.println("1---下落,2---向左,3---向右,0---退出");
		paint(wall,t);
		int control = s.nextInt();
		while(control != 0){
			if(control>3 || control<1){
				System.out.println("输入有误请重新输入");
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
		System.out.println("游戏结束!");
	}
	public static void paint(Wall wall,T t){
		//获取墙的宽高
		int height = wall.getHeight();
		int width = wall.getWidth();
		for(int i=0;i<height;i++){//对应row
			for(int j=0;j<width;j++){//对应col
				boolean b = true;
				//打印方块数组
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






