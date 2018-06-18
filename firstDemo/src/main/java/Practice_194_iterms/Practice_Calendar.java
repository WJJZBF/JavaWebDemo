package Practice_194_iterms;

import com.alibaba.fastjson.JSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-05-03 下午2:51
 **/
public class Practice_Calendar {
    public static void main(String[] args) {
//        new Practice_Calendar().test_format();
//        new Practice_Calendar().test_parse();
        Practice_Calendar pc = new Practice_Calendar();
//        pc.test_dateArray();
        pc.find();

    }


    public void test_format() {
        //format练习，日期转字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        String s = sdf.format(d.getTime());
        System.out.println(s);
    }


    public void test_parse() {
        //parse练习，字符串转日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str = "2018/09/23 21:34:13";
        try {
            Date d = sdf.parse(str);
            System.out.printf("字符串%s转换成 yyyy/MM/dd HH:mm:ss %n转换为日期对象:%s", str, d.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void find() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar c=Calendar.getInstance();
        Date now=c.getTime();
        String intoString=sdf.format(c.getTime());
        System.out.println(intoString);
        c.setTime(now);
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DATE,-3);
        c.add(Calendar.DATE,1);
        System.out.println(sdf.format(c.getTime()));

    }

    public void test_dateArray() {

        Random random = new Random();
        String[] dates = new String[9];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        for (int i = 0; i < 9; i++) {
            //定义时间
            int day;
            int year = random.nextInt(30) + 1970;
            int month = random.nextInt(11);
            int hour = random.nextInt(23);
            int min = random.nextInt(59);
            int sec = random.nextInt(59);
            //初始化该数组
            if (year % 4 == 0 & year % 100 != 0) {
                //判断是否闰年，是闰年则进行判断月份
                if (month % 2 == 0) {
                    //判断是否是双数月份
                    if (month == 2) {
                        //判断是否是2月份
                        day = random.nextInt(28);
                    } else {
                        day = random.nextInt(29);
                    }
                } else {
                    //单数月份则执行
                    day = random.nextInt(30);
                }
            } else {
                if (month % 2 == 0) {
                    if (month == 2) {
                        day = random.nextInt(27);
                    } else {
                        day = random.nextInt(29);
                    }
                } else {
                    day = random.nextInt(30);
                }
            }
            Date date = new Date(year - 1900, month, day + 1, hour, min, sec);//初始化时间
            dates[i] = sdf.format(date.getTime());
        }

        System.out.println(JSON.toJSONString(dates));
        String tmp;
        for (int i = 0; i < 9; i++) {//取数组中的字符串
            for (int j = i + 1; j < 9; j++) {//从i+1开始，i 与i+1比较
                try {
                    Date one = sdf.parse(dates[i]);//对该字符串转为日期对象
                    Date two = sdf.parse(dates[j]);//对该字符串转为日期对象
                    if (one.getHours() > two.getHours()) {//获取小时进行对比
                        tmp = dates[i];
                        dates[i] = dates[j];
                        dates[j] = tmp;

                    } else if (one.getHours() == two.getHours()) {//小时一样，则判断分

                        if (one.getMinutes() > two.getMinutes()) {
                            tmp = dates[i];
                            dates[i] = dates[j];
                            dates[j] = tmp;

                        } else if (one.getMinutes() == two.getMinutes()) {//分一样，则比较秒

                            if (one.getSeconds() > two.getSeconds()) {
                                tmp = dates[i];
                                dates[i] = dates[j];
                                dates[j] = tmp;

                            }
                        }
                    }

                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        }
        System.out.println(JSON.toJSONString(dates));
    }
}
