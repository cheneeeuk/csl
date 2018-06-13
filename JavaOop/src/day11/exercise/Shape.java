package day11.exercise;

/**
 * Created by Administrator on 2018/6/13.
 */
public interface Shape {
    double PI = 3.1415;
    double girth();//Բ���ܳ�
    double area();//Բ�����
}
//Circle   Triangle   Rectangle    Square
//����
class Rectangle implements Shape{
    double a;
    double b;
    public Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double girth() {
        return 2*(a+b);
    }

    @Override
    public double area() {
        return a*b;
    }
}
//������
class Triangle implements Shape{
    double a;
    double b;
    double c;
    double p = (a+b+c)/2;
    @Override
    public double girth() {
        return (a+b+c);
    }

    @Override
    public double area() {
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
//Բ��
class Circle implements Shape{
    double r;
    @Override
    public double girth() {
        return 2*Shape.PI*r;
    }

    @Override
    public double area() {
        return Shape.PI*r*r;
    }
}
//������
class Square extends Rectangle{
    double a;
    public Square(double a) {
        super(a, a);
    }
}
