package Practice_194_iterms;

import java.util.Scanner;

;

/**
 * @author wujiaojiao
 * @create 2018-04-20 下午7:03
 **/
public class Compare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = reader.nextInt();
        System.out.println("请输入第二个数：");
        int b = reader.nextInt();

        System.out.println("比较" + a + ">" + b + ":" + (a > b));
        System.out.println("比较" + a + ">" + b + ":" + (a < b));
        System.out.println("比较" + a + ">=" + b + ":" + (a == b));
        System.out.println("比较" + a + ">=" + b + ":" + (a != b));

        int i=1;
        boolean x=!(i++==3);
        boolean y=x^(i++==2);
        //异或。不同是真，相同为假
        System.out.println(i);
        System.out.println(y);
        boolean w=y&(i++==3);
        //注意区分&与&&，前者的两侧都会运行，而&&只要第一个是False，第二个不运算；
        // ｜与｜｜的规则是｜两侧都需要运算，｜｜第一个为true，第二个不运算
        System.out.println(w);
        System.out.println(i);


    }
}
