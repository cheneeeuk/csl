package day08.csl;


import org.junit.Test;

/**
 * Created by Administrator on 2018/6/9.
 */
public class TestDay08Test {
    @Test
    public void test(){
        int k = 0;
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                k = test11(i,j);
            }
        }
        System.out.println(k);
    }

    public static int test11(int a,int b){
        int sum = a + b;
        return sum;
    }
}