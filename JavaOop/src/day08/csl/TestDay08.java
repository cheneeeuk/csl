package day08.csl;

public class TestDay08 {

	public static void main(String[] args) {
//		fushu f1 = new fushu(2,3);
//		fushu f2 = new fushu(3,4);
//		fushu f3 = f1.sum(f2);
		Integer i1 = 1;
		Integer i2 = 1;
		Integer i3 = new Integer(1);
		Integer i4 = new Integer(1);
		System.out.println();
	}
	/*
	 * 斐波那契数列:0,1,1,2,3,5,8,13... 
	 * --- 输入一个数字n,获取第n项 --- 从第三项开始,每一项都是它之前的两项的和	
	 */
	public static int f(int n){
		if(n == 1){
			return 0;
		}
		if(n == 2){
			return 1;
		}
		return f(n-1)+f(n-2);
	}
	
	/*
	 * 定义一个类表示婴儿
	 */
}

class A{
	String name;
	byte age;
	static {
		
	}
	public A(String name){
		this.name = name;
		System.out.println(this);
	}
	public A(String name,byte age){
		this(name);
		this.age = age;
		System.out.println(this);
	}
}

class fushu{
	int shibu;
	int xubu;
	public fushu(){
		System.out.println("当前活动对象为"+this);
	}
	public fushu(int shibu,int xubu){
		this.shibu = shibu;
		this.xubu = xubu;
		System.out.println("当前活动对象为"+this);
	}
	public fushu sum(fushu f){
		int a = f.shibu + this.shibu;
		int b = f.xubu + this.xubu;
		System.out.println("当前活动对象为"+this);
		return new fushu(a,b);
	}
	
}
