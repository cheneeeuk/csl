package day06.csl;

import java.util.Arrays;

import org.junit.Test;

public class TestDay06 {
	//选择排序
	//算法:选择一个元素 依次与后面元素进行比较
	public void test01(){
		int[] arr = {2,5,1,3,7,6,4};
		for(int i=0;i<arr.length-1;i++){//一共要比较n-1轮
			for(int j=i+1;j<arr.length;j++){
				//第i个元素 依次与后面的比较
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//数组的反转
	public void test02(){
		//利用一个新的数组来倒存原数组的值
		int[] arr = {2,5,1,3,7,6,4};
		Arrays.sort(arr);//给数组进行升序排列
		int[] arr2 = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			arr2[arr2.length-i-1] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
	
	//数组的反转方法2
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
	 * 猴子选大王:有15只猴子围城了一圈选大王,每只猴子依次报数,报到7的猴子就被淘汰,剩余1只猴子,那么这只猴子就是大王
		--- 这只成为大王的猴子是第几只
	 */
	@Test
	public void test04(){
		boolean[] arr = new boolean[15];
		//规定arr里的元素false为存活 true为淘汰
		System.out.println(arr[0]);
		int index = 0;//轮流报数记录下标
		int count = 1;//记录报数的数字
		int last = 15;//记录存活的猴子数量
		while(last > 0){
			//判断当前猴子是否存活
			System.out.println(arr[index]);
			if(!arr[index])
				//存活则报数
				count++;
			System.out.println(count);
				//若报数到7则淘汰并重新开始报数
			if(count == 7){
				last--;//记录存活数量
				arr[index] = true;//数到7的猴子淘汰
				count = 1;
			}
			if(index == 14){
				index = 0;//重置index
			}
			//记录下标
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
	 * 打印杨辉三角
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
				// 分配列数
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
	 * 哥德巴赫猜想:任何一个大于等于6的偶数都可以分解成两个质数之和
		输入一个数字,输出这个数字的所有分解形式
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
			//1,2是质数
			return true;
		if(num % 2 ==0)
			//偶数一定不是质数
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
