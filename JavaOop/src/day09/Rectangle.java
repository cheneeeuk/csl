package day09;

/**
 * Created by Administrator on 2018/6/11.
 */
public class Rectangle {
    private double length;
    private double height;

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(){

    }
    public Rectangle(double length,double height){
        this.length = length;
        this.height = height;
    }
    //周长
    public double getGirth(){
        return 2*(length + height);
    }
    //面积
    public double getArea(){
        return length * height;
    }

    public static void main(String[] args){
        Rectangle r = new Rectangle(3.2,2.5);
        System.out.println(r.getGirth());
        System.out.println(r.getArea());

        Square s = new Square(4.1);
        System.out.println(s.getGirth());
        System.out.println(s.getArea());
    }
}
//代表正方形
class Square extends Rectangle{
    public Square(double ls){
        super(ls,ls);
    }
}