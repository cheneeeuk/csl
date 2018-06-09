package day02;

import org.junit.Test;

public class Test1 {
	
	public void test(){
		
		int i = 5, j = 6;
		//boolean b = false && i++ > 3 || ++j > 2
		boolean b = true || i++ > 5 && ++j > 10 || ++i > 4 && ++j<3;// ||会导致后面全部短路
		System.out.println(i);
		System.out.println(j);
	}
	
	
	public void test4(){
		int j = 0;
		for(int i=1;i<129;i++){
			boolean b = test2(i);
			if(b){
				j++;
			}
		}
		System.out.println(j);
//		int score = 91;
//		
//		char lv;
//		
//		lv = score<60?'E':(score<70?'D':(score<80?'C':(score<90?'B':'A')));
//		
//		System.out.println(lv);
	}
	public boolean test2(int i){
//		int i = 256;
		boolean b = true;
		if(i == 2 || i==1){
			b = true;
			return b;
		}
		while(i>2){
			if(i%2==0){
				i /= 2;
			}else{
				b = false;
				return b;
			}
		}
//		System.out.println(i);
		if(i != 2){
			b = false;
		}
//		System.out.println(b);
		return b;
	}
	
	
	public void test3(){
		int i = 2,j = 3;
		j = i+j;
		i = j-i;
		j = j-i;
		System.out.println(i);
		System.out.println(j);
	}
	
	
	public void test5(){
		int year = 2200;
		  
		boolean isRunYear;
		  
		isRunYear = year%100==0?year%400==0:year%4==0;
		
		System.out.println(isRunYear);
	}
	
	@Test
	public void test6(){
		int i = 5;
//		int j = ~i++;
//		i = ~i++;
		System.out.println(~i++);
		System.out.println(i);
		System.out.println((1&1) == 1);
	}
}






















