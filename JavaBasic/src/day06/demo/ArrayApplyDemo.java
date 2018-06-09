package day06.demo;

import java.util.Arrays;

public class ArrayApplyDemo {

	public static void main(String[] args){
		
		int[] arr = {15,24,37,49,52,58,60,76};
		
		// int[] arr2 = new int[5];
		
		// 表示从arr的下标为2的位置开始取3个元素，向arr2的下标为1的位置开始放
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
		// 记录最小下标
		int min = 0;
		// 记录最大下标
		int max = arr.length - 1;
		// 计算出一个中间下标
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
		
		// 数组的反转
		// 时间复杂度是O(n),空间复杂度是o(n)
		/*
		int[] arr2 = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i > 0; i--, j++){
			arr2[j] = arr[i];
		}
		
		// 时间复杂度是O(n),空间复杂度是o(1)
		for(int i = 0, j = arr.length - 1; i < j; i++, j--){
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		*/
		
		// 选择排序
		/*
		for(int i = 1; i < arr.length; i++){ // 控制轮数
			
			for(int j = 1; j <= arr.length - i; j++){ // 控制次数
			
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