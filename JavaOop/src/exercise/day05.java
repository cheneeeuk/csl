package exercise;

/**
 * Created by Administrator on 2018/6/11.
 */
public class day05 {
    public static void main(String[] args){
        test11(6);
    }
    /**
     * 1.дһ������add,��������������Ϊ����,���������������ĺ�
     */
    public static int test01(int i,int j){
        return i+j;
    }
    /**
     * 2.дһ����������һ������,��ӡ�����������������
     */
    public static void test02(int num){
        for(int i=1;i<=num/2;i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
    /**
     * 3.дһ������,����һ������n,���1+2+3+...+n�ĺ�
     */
    public static void test03(int n){
        System.out.println(n*(n+1)/2);
    }

    /**
     * 4.дһ����������һ����������������������һ����λ��
     */
    public static void test04(int n){
        int count = 0;//��¼λ��
        while(n>0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }

    /**
     * 5.дһ����������һ������ �ж���������Ƿ���һ������
     */
    public static void test05(int n){
        if(n%2 == 0)
            System.out.println("��������");
        for(int i=3;i<=n/2;i+=2){
            if(n%i == 0){
                System.out.println("��������");
                return;
            }
        }
        System.out.println("������");
    }

    /**
     * 6.дһ��������������(x1,x2)֮��ľ���
     */
    public static void test06(double x1,double y1,double x2,double y2){
        System.out.println(Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))));
    }

    /**
     * 7.��֪������ȫƽ����λ��abc��xyz����a,b,c,x,y,zδ���ǲ�ͬ��,
     * ��ax,by,cz��������ȫƽ������abc��xyz
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
     * �ж�һ����λ���Ƿ�����ȫƽ����
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
     * 8.�������A��ȫ������(����1,������A����)֮�͵���B,������B��ȫ������֮�͵���A
     * �������A B��һ�������� ��3000���ڵ�ȫ��������
     */
    public static void test08(){
        int count = 0;
        int n = 0;//ȥ�ش���
        for(int i=1;i<=3000;i++){
            if(i == n)
                continue;//ȥ�ش���
            int j = sumYinzi(i);
            if(i!=j && sumYinzi(j) == i){
                n = j;
                System.out.println(i+","+j);
            }
        }
    }
    /**
     * ��һ����ȫ�����ӵĺ�
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
     * 9.��֤��°ͺղ���:�κ�һ������6��ż��,���ֽܷ�����������ĺ�,Ҫ������һ������
     *   ���������ܱ��ֽ�������������ĺ�
     *   ����:14
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
     * ��֤һ�����Ƿ�Ϊ����
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
     * 10.����һ������n,���õݹ�������1~n�ĺ�
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
     * ��ʹ�õݹ��ȡ쳲��������еĵ�n��
     * 1 1 2 3 5 8
     */
    public static void test11(int n){
        System.out.println(f2(n));
    }
    /**
     * ����f(n) = f(n-1)+f(n-2)
     */
    public static int f2(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return (f2(n-1)+f2(n-2));
    }
}
