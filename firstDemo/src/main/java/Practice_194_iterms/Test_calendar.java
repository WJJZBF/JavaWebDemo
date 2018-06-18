package Practice_194_iterms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

;

/**
 * @author wujiaojiao
 * @create 2018-05-03 下午2:08
 **/
public class Test_calendar {
    public static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        Date date=c.getTime();//当前日期
        System.out.println(format(c.getTime()));
        c.setTime(date);
        c.add(Calendar.MONTH,1);//下个月的今天
        c.setTime(date);
        c.add(Calendar.YEAR,-1);//去年的今天
        c.setTime(date);
        c.add(Calendar.MONTH,-1);//上个月
        c.set(Calendar.DATE,2);//第三天
        System.out.println(format(c.getTime()));

    }
    public static String format(Date time){
        return sdf.format(time);
    }
}
