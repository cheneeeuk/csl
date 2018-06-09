package day06.exer;

import java.util.Scanner;
public class PascalTriangleExer {
	
	public static void main(String[] args){
		
		// ��ȡ����
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		// ����һ����ά����洢����������
		int[][] arr = new int[row][];
		
		for(int i = 0; i < row; i++){
			// ��ʼ��ÿһ�е����һά����
			arr[i] = new int[i + 1];
			// ��һά���������Ԫ��
			for(int j = 0; j <= i; j++){
				//  �ж��Ƿ���ÿһ�е�ͷ��������β��
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