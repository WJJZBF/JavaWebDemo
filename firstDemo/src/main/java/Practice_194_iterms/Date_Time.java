package Practice_194_iterms;


import java.util.Date;
import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-05-03 下午12:30
 **/
public class Date_Time {
    public void date(){
        Date time=new Date();
        System.out.println(time);
        System.out.println(time.toString());//打印当前时间
        Date time2=new Date(5000);
        System.out.println(time2);
        Date time3=new Date();
        System.out.println(time3.getTime());//getTime()得到一个long的整形
        System.out.println(System.currentTimeMillis());
        Date time4=new Date(0);//用0做构造方法
        System.out.println(time4);

    }
    public void date1(){

        //借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期

        Date tm_begin=new Date(95,0,1);
        System.out.println(tm_begin.toString());
//        int year=tm_begin.getYear();
//        System.out.println(year);
        Date tm_end=new Date(95,11,31,23,59,59);
        System.out.println(tm_end.toString());
        Random random=new Random();
        int month=random.nextInt(11);
        int date=random.nextInt(30)+1;
        int hour=random.nextInt(23);
        int min=random.nextInt(59);
        int sec=random.nextInt(59);
        System.out.println(new Date(95,month,date,hour,min,sec));

    }

    public static void main(String[] args) {
        Date_Time date_time=new Date_Time();
//        date_time.date();
        date_time.date1();

    }
}
