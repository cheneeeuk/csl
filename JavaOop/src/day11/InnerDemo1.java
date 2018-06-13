package day11;

/**
 * Created by Administrator on 2018/6/13.
 */
public class InnerDemo1 {
	public static void main(String[] args) {

		new Outer().o();
	}
}

// 定义在方法中的类---方法内部类/局部内部类
// 只能在定义它的方法中使用
// 方法内部类中不能定义静态变量和静态方法,可以定义静态常量
// 方法内部类可以使用外部类的一切属性和方法
// 方法内部类不能使用当前方法中的局部变量,但是可以使用当前方法中的局部常量
// 方法内部类可以继承别的类,也能实现接口
// 只能使用final或者abstract来修饰
// 应用场景:重复利用某段代码并且只能在指定方法中重复使用该方法
abstract class Pet {
	private String name;

	public abstract void eat();
}

class Outer {
	private static int k = 1;
	private int i = 1;

	public void o() {
		final int a = 1;
		class Inner extends Pet {
			static final int j = 1;

			public void in() {
                //ou();调用的是内部ou
                //调用外部ou需要写成以下方式
				Outer.this.ou();
			}

			 public void ou(){
			 System.out.println("ou inner");
			 }
			@Override
			public void eat() {
				System.out.println("内部类在吃食");
			}
		}
        new Inner().in();
	}

	private void ou() {

		System.out.println("ou outer");
	}

	public int getK() {

		return k;
	}

}