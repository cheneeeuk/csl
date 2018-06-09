package exercise.day04;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Exercise {
	/*
	 * �Զ���һ����������arr ����һ������n ���n�������д��� �����n���±�
	 * ��������������-1
	 */
	
	public void test01(){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[]{1,2,3,4,5};
		for(int i=0;i<arr.length;i++){
			if(arr[i] == num){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
	
	/*
	 * ��֪һ����ά����A��ʾһ������,��A��ת��
	 * ����ת�ú���:��ʾ��һ����������л���
	 * 1   2   3
	 * 4   5   6
	 * -->
	 * 1   4
	 * 2   5
	 * 3   6
	 */
	public void test02(){
		Scanner s = new Scanner(System.in);
		System.out.println("��������������,�м��Կո����");
		int row , col;
		row = s.nextInt();
		col = s.nextInt();
		int[][] t1 = new int[row][col];
		System.out.println("����"+row+"x"+col+"����");
		int n = 1;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				t1[i][j] = n++;
			}
		}
		for(int[] arr : t1){
			System.out.println(Arrays.toString(arr));
		}
		int[][] t2 = new int[col][row];
		for(int i=0;i<t2.length;i++){//3
			for(int j=0;j<t2[i].length;j++){//2
				t2[i][j] = t1[j][i];
			}
		}
		
		System.out.println("�þ����ת��Ϊ:");
		for(int[] arr : t2){
			System.out.println(Arrays.toString(arr));
		}
	}
	
	/*
	 * ����һ�����齫������������е�Ԫ�ص�˳����еߵ�
	 */
	
	public void test03(){
		int[] arr = {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	/*
	 * ����������
	 * 1
	 * 1  1
	 * 1  2  1
	 * 1  3  3  1
	 * 1  4  6  4  1
	 */
	@Test
	public void test04(){
		Scanner s = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ��������ǵ�����...");
		int n = s.nextInt();
		if(n == 1){
			System.out.println(1);
			return;
		}
		if(n == 2){
			System.out.println(1);
			System.out.print(1+"\t");
			System.out.print(1);
			return;
		}
		//׼��һ����ά����������������
		int[][] arr = new int[n][];
		if(n>2){
			arr[0] = new int[1];
			arr[0][0] = 1;
			arr[1] = new int[2];
			arr[1][0] = 1;
			arr[1][1] = 1;
			for(int i=2;i<n;i++){
				arr[i] = new int[i+1];
				for(int j=0;j<=i;j++){
					if(j==0 || j==i){
						arr[i][j] = 1;
					}else{
						arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
					}
				}
			}
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
		}
	}
	

	
	/*
	 * ��������
	 * ������������m,n���һ��m��n�еľ��� ���������1~m*n ��Щ��Ȼ������������������������
	 * �����������4,5��������Ϊ:
	 * 1	2	3	4	5
	 * 14   15  16  17  6
	 * 13   20  19  18  7                 
	 * 12   11  10  9   8                 
	 */
	public void test06(){
		int m = 4;
		int n = 5;
		int[][] arr = new int[m][n];
		int count = 1;
		for(int i=0;i<n;i++){
			arr[0][i] = count++;
		}
		int flag1 = 0;
		int flag2 = 1;//���Ƽ���
		while(true){
			if(flag1%2==0){
				//��ӡ��
				for(int i=0;i<m-flag2;i++){
					arr[i+flag2][n-flag2] = count;
				}
				flag1++;
				flag2++;
			}else{
				//��ӡ��
				flag1++;
			}
		}
		
	}
	/*
	 * ����ĸ��Ƽ�����
	 */
	public void test07(){
		int[] arr1 = new int[]{1,2,3,4,5};
		int[] arr2 = new int[3];//��arr1������copy��arr2
		System.arraycopy(arr1, 0, arr2, 0, 3);//���ܳ���Ŀ������ĳ��� ����ᱨ�����±�Խ���쳣
		System.out.println(Arrays.toString(arr2));
		
		arr1 = Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(arr1));
	}
}
