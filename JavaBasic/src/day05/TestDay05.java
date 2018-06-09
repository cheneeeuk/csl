package day05;

import java.util.Arrays;

import org.junit.Test;

public class TestDay05 {
	//获取数组中的最大值
	public void test01(){
		int[] arr = {2,1,3,5,4};
		int max = arr[0],min = arr[0];
		for(int i : arr){
			if(i>max){
				max = i;
			}
			if(i<min){
				min = i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
	
	//数组排序
	//冒泡排序相邻两个元素比较
	public void test02(){
		int[] arr = {2,3,1,8,5,7,6};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public void test03(){
		int count = 0;
		int[] arr = {7,6,4,5,3,2,1};
		for(int i=1;i<arr.length;i++){//6次
			for(int j=1;j<=arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
		}
		System.out.println(count);
//		System.out.println(Arrays.toString(arr));
	}
	
	
	//选择排序
	public void test04(){
		int count = 0;
		int[] arr = {7,6,4,5,3,2,1};
		int minIndex = 0;
		for(int i=0;i<arr.length-1;i++){
			minIndex = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}
			}
			if(i != minIndex){
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
	
	@Test
	//二分查找法
	public void test05(){
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,11,11,12,13,14,15,16};
		int num = 11;
		//请找出15在数组中的位置(下标)
		int minIndex = 0;
		int maxIndex = arr.length-1;
		int midIndex = (minIndex+maxIndex)>>>1;//
		//找到min与max中间的下标与num进行比较
		for(;minIndex<=maxIndex;){
				if(num == arr[midIndex]){
					System.out.println(num+"在数组中的下标为:"+midIndex);
					//如果找到元素 继续查找前后是否有相同元素
					//以mid为中心往前找
					for(int i=midIndex-1;i>=0;i--){
						if(arr[i] == num){
							System.out.println(num+"在数组中的下标为:"+i);
						}else{
							break;
						}
					}
					//以mid为中心往后找
					for(int i=midIndex+1;i<arr.length;i++){
						if(arr[i] == num){
							System.out.println(num+"在数组中的下标为:"+i);
						}else{
							break;
						}
					}
					return;
				}else if(num>arr[midIndex]){
					minIndex = midIndex+1;
				}else{
					maxIndex = midIndex-1;
				}
				midIndex = (minIndex+maxIndex)>>>1;
		}
		if(minIndex>maxIndex){
			System.out.println("数组中不存在:"+num);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
