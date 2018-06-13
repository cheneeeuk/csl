package day10;

/**
 * Created by Administrator on 2018/6/12.
 */
public class test {
    public static void main(String[] args) {
        new SB();
        //先加载父类静态 A1 加载子类静态 因为有静态引用变量SC 所以加载SC
        //A1 C B1 C A2 A3 C D B2 C D B3
    }
}

class A{
    public static void a(){
         int aa;
    }
}

class SA {
    SC c = new SC();

    static {
        System.out.println("A1");
    }

    {
        System.out.println("A2");
    }

    public SA() {
        System.out.println("A3");
    }
}

class SB extends SA {
    static SC c = new SC();
    SD d = new SD();

    static {
        System.out.println("B1");
    }

    {
        System.out.println("B2");
        d = new SD();
    }

    public SB() {
        System.out.println("B3");
    }
}

class SC {
    public SC() {
        System.out.println("C");
    }
}

class SD extends SC {
    public SD() {
        System.out.println("D");
    }
}

