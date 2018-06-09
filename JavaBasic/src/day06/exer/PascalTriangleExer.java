package day06.exer;

import java.util.Scanner;
public class PascalTriangleExer {
	
	public static void main(String[] args){
		
		// 获取行数
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		// 定义一个二维数组存储这个杨辉三角
		int[][] arr = new int[row][];
		
		for(int i = 0; i < row; i++){
			// 初始化每一行的这个一维数组
			arr[i] = new int[i + 1];
			// 向一维数组中添加元素
			for(int j = 0; j <= i; j++){
				//  判断是否是每一行的头部或者是尾部
				if(j == 0 || j == i)
					arr[i][j] = 1;
				else					
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}