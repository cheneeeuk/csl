package day06.csl;

import java.util.Arrays;

import org.junit.Test;

public class TestDay06 {
	//ѡ������
	//�㷨:ѡ��һ��Ԫ�� ���������Ԫ�ؽ��бȽ�
	public void test01(){
		int[] arr = {2,5,1,3,7,6,4};
		for(int i=0;i<arr.length-1;i++){//һ��Ҫ�Ƚ�n-1��
			for(int j=i+1;j<arr.length;j++){
				//��i��Ԫ�� ���������ıȽ�
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//����ķ�ת
	public void test02(){
		//����һ���µ�����������ԭ�����ֵ
		int[] arr = {2,5,1,3,7,6,4};
		Arrays.sort(arr);//�����������������
		int[] arr2 = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			arr2[arr2.length-i-1] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
	
	//����ķ�ת����2
	public void test02_2(){
		//
	}
	
	public void test03(){
	a:	for(int i=0;i<3;i++){
	b:		for(int j=0;j<3;j++){
				System.out.println(j);
				if(j == 1){
					continue a;
				}
			}
		}
	}
	
	/*
	 * ����ѡ����:��15ֻ����Χ����һȦѡ����,ÿֻ�������α���,����7�ĺ��Ӿͱ���̭,ʣ��1ֻ����,��ô��ֻ���Ӿ��Ǵ���
		--- ��ֻ��Ϊ�����ĺ����ǵڼ�ֻ
	 */
	@Test
	public void test04(){
		boolean[] arr = new boolean[15];
		//�涨arr���Ԫ��falseΪ��� trueΪ��̭
		System.out.println(arr[0]);
		int index = 0;//����������¼�±�
		int count = 1;//��¼����������
		int last = 15;//��¼���ĺ�������
		while(last > 0){
			//�жϵ�ǰ�����Ƿ���
			System.out.println(arr[index]);
			if(!arr[index])
				//�������
				count++;
			System.out.println(count);
				//��������7����̭�����¿�ʼ����
			if(count == 7){
				last--;//��¼�������
				arr[index] = true;//����7�ĺ�����̭
				count = 1;
			}
			if(index == 14){
				index = 0;//����index
			}
			//��¼�±�
			index++;
		}
		for(int i=0;i<arr.length;i++){
			if(!arr[i]){
				System.out.println(i+1);
				break;
			}
		}
	}
	
	
	/*
	 * ��ӡ�������
	 */
	public void test05(){
		int n = 10;
		int[][] arr = new int[n][];
		if (n == 1) {
			arr[0][0] = 1;
		} else if (n == 2) {
			arr[0][0] = 1;
			arr[1][0] = 1;
			arr[1][1] = 1;
		} else if (n > 2) {
			for (int i = 0; i < n; i++) {
				// ��������
				arr[i] = new int[i + 1];
				for (int j = 0; j <= i; j++) {
					if (i == 0 || j == 0 || j == i) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
					}
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

	/*
	 * ��°ͺղ���:�κ�һ�����ڵ���6��ż�������Էֽ����������֮��
		����һ������,���������ֵ����зֽ���ʽ
	 */
//	@Test
	public void test06(){
		int num = 99;
		for(int num1=1;num1<num/2;num1++){
			if(isPrime(num1) && isPrime(num-num1)){
				System.out.println(num1+","+(num-num1));
			}
		}
	}
	
	public static boolean isPrime(int num){
		if(num == 1 || num == 2)
			//1,2������
			return true;
		if(num % 2 ==0)
			//ż��һ����������
			return false;
		for(int i=3;i<num/2;i+=2){
			if(num % i ==0)
				return false;
		}
		return true;
	}
	
	public void sumYinzi(){
		int num = 100;
		int sum=0;
		for(int i=1;i<=num/2;i++){
			if(num % i == 0){
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
