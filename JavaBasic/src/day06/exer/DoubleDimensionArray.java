package day06.exer;

public class DoubleDimensionArray {

	public static void main(String[] args){
	
		/*
		int[][] arr = new int[5][6];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][4]);
		*/
		
		/*
		int[][] arr = new int[5][];
		arr[0] = new int[5];
		arr[1] = new int[1];
		System.out.println(arr[0][1]);
		// NullPointerException
		System.out.println(arr[3][0]);
		*/
		
		// int arr[][] = new int[3][];
		int[] arr[] = new int[3][];
		System.out.println(arr);
		System.out.println(arr[0]);
		
		/*
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
		*/
		
		// ��Ϊ��ά�����ÿһ��λ������һ��һά���飬���Կ��Զ���һ��һά�������α�ʾÿһ��Ԫ�أ�һά���飩
		for(int[] is : arr){
			for(int i : is){
				System.out.println(i);
			}
		}
	}

}