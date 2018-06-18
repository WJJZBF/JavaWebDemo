package Practice_194_iterms;

import java.util.Scanner;

;

/**
 * @author wujiaojiao
 * @create 2018-04-22 下午7:22
 **/
public class Switch {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入月份");
        int month=reader.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                    System.out.println("春天");
                    break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");
                break;
            default:
                    System.out.println("什么鬼");
        }
    }
}
