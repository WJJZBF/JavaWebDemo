package Practice_194_iterms;

import com.alibaba.fastjson.JSON;

import java.lang.Character;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

//set不可以添加重复的数据信息，如果想遍历，可以用迭代器

/**
 * @author wujiaojiao
 * @create 2018-05-06 下午4:08
 **/
public class HashSetClass {
    public static void main(String[] args) {
        HashSetClass hsc=new HashSetClass();
//        hsc.stringArrays();
        hsc.randomSet();

    }

    public void stringArrays() {
        String[] strings = new String[300];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = beString();
        }
        System.out.println(JSON.toJSONString(strings));
        System.out.println(" ");

        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> set = new HashSet<String>();

        System.out.print("重复的字符串：");
        for (String each : strings) {
            if (hashSet.contains(each)) {
                set.add(each);
            }
            hashSet.add(each);
        }
        System.out.println(set);
    }

    public char[] beChar() {
        char[] chars = new char[62];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ('a' + i);
        }
        for (int i = 26; i < 52; i++) {
            chars[i] = (char) ('A' + i - 26);
        }
        for (int i = 52; i < 62; i++) {
            chars[i] = (char) ('0' + i - 52);
        }
        return chars;
    }

    public String beString() {
        Random random = new Random();
        char[] chars = beChar();
        int index1 = random.nextInt(chars.length);
        int index2 = random.nextInt(chars.length);
        String a = String.valueOf(chars[index1]);
        String b = String.valueOf(chars[index2]);
        String str = a + b;
        return str;
    }

    public void randomSet() {
        Random random = new Random();
        HashSet<Integer> num = new HashSet<Integer>();
        while (true) {
            int randomNum = random.nextInt(9999);
            num.add(randomNum);
            if (num.size() == 20) {
                break;
            }
        }
        System.out.println(num);
    }

    public void setFunc() {
        //set的遍历
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 5; i++) {
            set.add(i);
        }
        for (Integer i : set) {
            System.out.println(i);

        }
//        set.add("geee");
//
//        set.add("geee");
//        System.out.println(set);
//        set.add("huhu");
//        System.out.println(set);
//        for (Iterator<Integer> i = set.iterator(); i.hasNext(); ) {
//            Integer j = i.next();
//            System.out.println(j);
//
//        }
    }
}
