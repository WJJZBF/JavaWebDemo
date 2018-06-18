package JAVA_practice_demo;

import static java.lang.System.out;

import java.util.*;


/**
 * @author wujiaojiao
 * @create 2018-04-14 下午7:56
 **/
class FullMoons {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        long day1 = c.getTimeInMillis();
        int DAY_IM = 60 * 60 * 24;

        for (int x = 0; x < 60; x++) {
            String.format("full moon on % tc", c);
        }
        out.println();
    }
}
