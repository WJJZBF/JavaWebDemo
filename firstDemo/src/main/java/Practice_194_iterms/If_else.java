package Practice_194_iterms;

import java.util.Scanner;

;

/**
 * @author wujiaojiao
 * @create 2018-04-22 下午5:02
 **/
public class If_else {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String status="";
        int year=reader.nextInt();
        if ((year%4==0&&year%100==1)||year%400==0){
            status="是闰年";
        }else {
            status="不是闰年";
        }
        System.out.println(year+status);


        System.out.println("=========");
        int i=0;
        if (true && i++==2 || i++ == 2) {

        }
        System.out.println(i);
//        System.out.println("今天是周几");
//        int day = reader.nextInt();
//        String bool = day >= 6 ? "周末" : "工作日";
//        System.out.println("今天是" + bool);


    }
}