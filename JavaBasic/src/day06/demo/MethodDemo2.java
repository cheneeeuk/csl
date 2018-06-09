package day06.demo;

public class MethodDemo2 {
	
	public static void main(String[] args){
		
		// 调用方法的时候传递的值---实际参数---实参
		printStar(3,6);
		printStar(5,7);
		
	}
	
	// 打印一个m行n列的*组成的矩形
	// 明确返回值类型 --- 打印矩形，没有返回值 --- void
	// 明确参数 --- m行n列，需要传递
	// 定义方法的时候在()内定义的参数称之为形式参数---形参
	// 方法名+参数列表 -> 方法签名
	// printStar(int, int)
	// public static void printStar(int a, int b){}
	// 同一个类中不能存在方法签名相同的方法
	public static void printStar(int m, int n){
		
		// 规避掉一些非法的数据
		if(m < 0 || n < 0)
			return ;
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}