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
	 * 쳲���������:0,1,1,2,3,5,8,13... 
	 * --- ����һ������n,��ȡ��n�� --- �ӵ����ʼ,ÿһ�����֮ǰ������ĺ�	
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
	 * ����һ�����ʾӤ��
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
		System.out.println("��ǰ�����Ϊ"+this);
	}
	public fushu(int shibu,int xubu){
		this.shibu = shibu;
		this.xubu = xubu;
		System.out.println("��ǰ�����Ϊ"+this);
	}
	public fushu sum(fushu f){
		int a = f.shibu + this.shibu;
		int b = f.xubu + this.xubu;
		System.out.println("��ǰ�����Ϊ"+this);
		return new fushu(a,b);
	}
	
}
