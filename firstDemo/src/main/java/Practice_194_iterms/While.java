package Practice_194_iterms;

import java.util.Scanner;

;

/**
 * @author wujiaojiao
 * @create 2018-04-22 下午7:33
 **/
public class While {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入数字");
        int x=reader.nextInt();
        int y=1;
        while(x>=1){
            y=y*x;
            x--;
        }
        System.out.println(y);
    }
}
