package day06.demo;

import java.util.Arrays;

public class ArrayApplyDemo {

	public static void main(String[] args){
		
		int[] arr = {15,24,37,49,52,58,60,76};
		
		// int[] arr2 = new int[5];
		
		// ��ʾ��arr���±�Ϊ2��λ�ÿ�ʼȡ3��Ԫ�أ���arr2���±�Ϊ1��λ�ÿ�ʼ��
		// System.arraycopy(arr, 2, arr2, 1, 3);
		// System.out.println(Arrays.toString(arr2));
		System.out.println(arr);
		arr = Arrays.copyOf(arr, 5);
		/*
			int[] arr2 = new int[len];
			len = arr.length < len ? arr.length : len;
			System.arraycopy(arr,0,arr2,0,len);
			arr = arr2;
		
		*/
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		
		/*
		int num = 59;
		// ��¼��С�±�
		int min = 0;
		// ��¼����±�
		int max = arr.length - 1;
		// �����һ���м��±�
		int mid = (min + max) / 2;
		
		while(min <= max){
			
			if(arr[mid] == num)
				break;
			else if(num > arr[mid])
				min = mid + 1;
			else 
				max = mid - 1;
			
			mid = (min + max) / 2;
			
		}
		if(min <= max)
			System.out.println(mid);
		else 
			System.out.println(-1);
		*/
		
		/*
		while(arr[mid] != num){
			
			if(num > arr[mid])
				min = mid + 1;
			else 
				max = mid - 1;
			
			if(min > max){
				mid = -1;
				break;
			}
			
			mid = (min + max) / 2;
			
		}
		
		System.out.println(mid);
		*/
		
		/*
		int[] arr = {2,5,1,7,4,3,0};
		int num = 8;
		int index = -1;
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] == num){
				index = i;
				break;
			}
			
		}
		System.out.println(index);
		*/
		
		// Arrays.sort(arr);
		
		// ����ķ�ת
		// ʱ�临�Ӷ���O(n),�ռ临�Ӷ���o(n)
		/*
		int[] arr2 = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i > 0; i--, j++){
			arr2[j] = arr[i];
		}
		
		// ʱ�临�Ӷ���O(n),�ռ临�Ӷ���o(1)
		for(int i = 0, j = arr.length - 1; i < j; i++, j--){
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		*/
		
		// ѡ������
		/*
		for(int i = 1; i < arr.length; i++){ // ��������
			
			for(int j = 1; j <= arr.length - i; j++){ // ���ƴ���
			
				if(arr[i - 1] > arr[i - 1 + j]){
					int temp = arr[i - 1];
					arr[i - 1] = arr[i - 1 + j];
					arr[i - 1 + j] = temp;
				}
				
			}
			
		}
		*/
		
		/*
		for(int i : arr){
			System.out.println(i);
		}
		*/
	}

}