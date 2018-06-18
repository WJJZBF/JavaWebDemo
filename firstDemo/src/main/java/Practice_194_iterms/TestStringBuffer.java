package Practice_194_iterms;

import java.util.Random;

/**
 * StringBuffer的练习
 * String与StringBuffer的性能区别?
 * <p>
 * 生成10位长度的随机字符串
 * 然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
 * 然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间
 * <p>
 * 提示: 使用System.currentTimeMillis() 获取当前时间(毫秒)
 *
 * @author wujiaojiao
 * @create 2018-05-02 下午6:51
 **/
public class TestStringBuffer {
    public void bornString() {
        //定义长度为10的字符数组
        char[] charForString = new char[10];
        Random random = new Random();

        //生成大写26个字符，小写26个字符，0-9的字符数组
        char[] chars = new char[61];
        for (int i = 0; i <= 26; i++) {
            chars[i] = (char) ('a' + i);
        }
        for (int i = 26; i < 52; i++) {
            chars[i] = (char) ('A' + i - 26);
        }
        for (int i = 52; i < 61; i++) {
            chars[i] = (char) ('0' + i - 52);
        }
//
//        //生成长度为10的随机字符串
//        for (int i = 0; i < 10; i++) {
//            int index = random.nextInt(chars.length);
//            charForString[i] = chars[index];
//        }
//        String s = String.valueOf(charForString);


//
        //使用String连接10000的随机字符串

        long bt = System.currentTimeMillis();
        System.out.println("String拼接执行前：" + bt);
        String y = "";//定义一个空字符串

        for (int i = 0; i < 10000; i++) {
            //生成长度为10的随机字符串
            for (int j = 0; j < 10; j++) {
                int index = random.nextInt(chars.length);
                charForString[j] = chars[index];
            }
            String s = String.valueOf(charForString);
            y += s+" ";
        }
//        System.out.println(y);
        long et = System.currentTimeMillis();
        System.out.println("String拼接执行后：" + et);
        System.out.println(et - bt);
        System.out.println(" ");


        //使用StringBuffer连接10000的随机字符串

        long bt_ = System.currentTimeMillis();
        System.out.println("StringBuffer拼接执行前：" + bt_);
        StringBuffer sb = new StringBuffer(y);
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 10; j++) {
                int index = random.nextInt(chars.length);
                charForString[j] = chars[index];
            }
            String s = String.valueOf(charForString);
            sb.append(s);
        }
        long et_ = System.currentTimeMillis();
        System.out.println("StringBuffer拼接执行后：" + et_);
        System.out.println(et_ - bt_);


    }

    public static void main(String[] args) {
        new TestStringBuffer().bornString();
    }
}
