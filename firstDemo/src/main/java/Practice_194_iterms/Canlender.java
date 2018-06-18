package Practice_194_iterms;

import java.util.Calendar;
import java.util.Date;

;

/**
 * @author wujiaojiao
 * @create 2018-05-03 下午1:22
 **/
public class Canlender {
//    private Canlender() {
//
//    }

//    private static Calender instance;
//
//    public static Calender getInstance() {
//        if (null == instance) {
//            instance = new Calender();
//
//        }
//        return instance;
//
//    }

    public static void main(String[] args) {
        Calendar canlender = Calendar.getInstance();
        Date date = canlender.getTime();
        System.out.println(date);
        Date da=new Date(0);
//        System.out.println(da);
        canlender.setTime(da);
        System.out.println(canlender.getTime());
    }
}
