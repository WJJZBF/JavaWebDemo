package Practice_194_iterms;
import java.util.*;

;

/**
 * @author wujiaojiao
 * @create 2018-04-20 下午3:45
 **/
public class Helloword {
    int i=1;
    public void method1(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
//        new Helloword().method1(5);

//        Scanner reader=new Scanner(System.in);
//        int a=reader.nextInt();
//        System.out.println("第一个整数："+a);
//        int b=reader.nextInt();
//        System.out.println("第二个整数："+b);
//        int c=a+b;
//        System.out.println("两者的和为："+c);
        int i=1;
        int j=++i + i++ + ++i + ++i + i++;
        System.out.println(j);

    }

//    public void method2(final int j){
//        j=5;
//    }


}
