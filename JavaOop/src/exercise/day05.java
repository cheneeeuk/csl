package exercise;

/**
 * Created by Administrator on 2018/6/11.
 */
public class day05 {
    public static void main(String[] args){
        test11(6);
    }
    /**
     * 1.写一个函数add,接收两个整数作为参数,返回这两个整数的和
     */
    public static int test01(int i,int j){
        return i+j;
    }
    /**
     * 2.写一个函数接收一个整数,打印这个整数的所有因子
     */
    public static void test02(int num){
        for(int i=1;i<=num/2;i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
    /**
     * 3.写一个函数,接收一个整数n,输出1+2+3+...+n的和
     */
    public static void test03(int n){
        System.out.println(n*(n+1)/2);
    }

    /**
     * 4.写一个函数接收一个正整数输出这个正整数是一个几位数
     */
    public static void test04(int n){
        int count = 0;//记录位数
        while(n>0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }

    /**
     * 5.写一个函数接收一个整数 判断这个整数是否是一个质数
     */
    public static void test05(int n){
        if(n%2 == 0)
            System.out.println("不是质数");
        for(int i=3;i<=n/2;i+=2){
            if(n%i == 0){
                System.out.println("不是质数");
                return;
            }
        }
        System.out.println("是质数");
    }

    /**
     * 6.写一个函数计算两点(x1,x2)之间的距离
     */
    public static void test06(double x1,double y1,double x2,double y2){
        System.out.println(Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))));
    }

    /**
     * 7.已知两个完全平方三位数abc和xyz其中a,b,c,x,y,z未必是不同的,
     * 而ax,by,cz是三个完全平方数求abc和xyz
     */
    public static void test07(){
//        int num1;//abc
//        int num2;//xyz
//        int ax = num1/100*10+num2/100;
//        int by = num1/10%10*10+num2/10%10;
//        int cz = num1%10*10+num2%10;
        for(int i=11;i<34;i++){
            for(int j=11;j<34;j++){
                if(isPingfang(i*i/100*10+j*j/100) &&
                   isPingfang(i*i/10%10*10+j*j/10%10) &&
                   isPingfang(i*i%10*10+j*j%10)){
                    System.out.println(i*i+","+j*j);
                }
            }
        }
    }

    /**
     *
     * 判断一个两位数是否是完全平方数
     */
    public static boolean isPingfang(int n){
        for(int i=4;i<10;i++){
            if(n == i*i){
                return true;
            }
        }
        return false;
    }

    /**
     * 8.如果整数A的全部因子(包括1,不包括A本身)之和等于B,且整数B的全部因子之和等于A
     * 则称整数A B是一对亲密数 求3000以内的全部亲密数
     */
    public static void test08(){
        int count = 0;
        int n = 0;//去重处理
        for(int i=1;i<=3000;i++){
            if(i == n)
                continue;//去重处理
            int j = sumYinzi(i);
            if(i!=j && sumYinzi(j) == i){
                n = j;
                System.out.println(i+","+j);
            }
        }
    }
    /**
     * 求一个数全部因子的和
     */
    public static int sumYinzi(int num){
        int count = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                count += i;
            }
        }
        return count;
    }
    /**
     * 9.验证哥德巴赫猜想:任何一个大于6的偶数,都能分解成两个质数的和,要求输入一个整数
     *   输出这个数能被分解成哪两个质数的和
     *   例如:14
     *   14=3+11
     *   14=7+7
     */
    public static void test09(int num){
        for(int i=2;i<=num/2;i++){
            if(isZhishu(i) && isZhishu(num-i)){
                System.out.println(i+","+(num-i));
            }
        }
    }
    /**
     * 验证一个数是否为质数
     */
    public static boolean isZhishu(int n){
        if(n%2 == 0)
            return false;
        for(int i=3;i<=n/2;i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    /**
     * 10.输入一个数字n,利用递归求出这个1~n的和
     */
    public static void test10(int n){
        System.out.println(f(n));
    }
    /**
     * f(n) = f(n-1)+n
     */
    public static int f(int n){
        if(n == 1){
            return 1;
        }
        return n+f(n-1);
    }
    /**
     * 请使用递归获取斐波那契数列的第n项
     * 1 1 2 3 5 8
     */
    public static void test11(int n){
        System.out.println(f2(n));
    }
    /**
     * 逆推f(n) = f(n-1)+f(n-2)
     */
    public static int f2(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return (f2(n-1)+f2(n-2));
    }
}
