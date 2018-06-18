package Practice_194_iterms;

import java.util.Scanner;

;

/**
 * @author wujiaojiao
 * @create 2018-04-26 下午3:36
 **/
public class Format {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
//        System.out.println("请输入地名");
//        String country=reader.next();
//        System.out.println("请输入公司类型");
//        String company=reader.next();
//        System.out.println("请输入老板名称");
//        String boss=reader.next();
//        System.out.println("请输入金额");
//        Integer money=reader.nextInt();
//        System.out.println("请输入产品");
//        String product=reader.next();
//        System.out.println("请输入价格计量单位");
//        String count=reader.next();
//        String sentenceFormat="%s最大%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%d个亿，%n带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、%n三%s多的%s，现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!%n我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!%n";
//        System.out.printf(sentenceFormat,country,company,boss,money,product,count,count,count,product,boss);
        Integer num=reader.nextInt();
        System.out.format("%0,8d%n",num);


    }
}
