package day05;

import java.util.Arrays;

import org.junit.Test;

public class TestDay05 {
	//��ȡ�����е����ֵ
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
	
	//��������
	//ð��������������Ԫ�رȽ�
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
		for(int i=1;i<arr.length;i++){//6��
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
	
	
	//ѡ������
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
	//���ֲ��ҷ�
	public void test05(){
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,11,11,12,13,14,15,16};
		int num = 11;
		//���ҳ�15�������е�λ��(�±�)
		int minIndex = 0;
		int maxIndex = arr.length-1;
		int midIndex = (minIndex+maxIndex)>>>1;//
		//�ҵ�min��max�м���±���num���бȽ�
		for(;minIndex<=maxIndex;){
				if(num == arr[midIndex]){
					System.out.println(num+"�������е��±�Ϊ:"+midIndex);
					//����ҵ�Ԫ�� ��������ǰ���Ƿ�����ͬԪ��
					//��midΪ������ǰ��
					for(int i=midIndex-1;i>=0;i--){
						if(arr[i] == num){
							System.out.println(num+"�������е��±�Ϊ:"+i);
						}else{
							break;
						}
					}
					//��midΪ����������
					for(int i=midIndex+1;i<arr.length;i++){
						if(arr[i] == num){
							System.out.println(num+"�������е��±�Ϊ:"+i);
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
			System.out.println("�����в�����:"+num);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
