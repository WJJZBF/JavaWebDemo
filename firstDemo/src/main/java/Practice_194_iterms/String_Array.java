package Practice_194_iterms;

import com.alibaba.fastjson.JSON;

import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-04-27 下午9:27
 **/
public class String_Array {
    public static void main(String[] args) {
        String[] stg = new String[8];
        char[] strings = {'1', '2', '4', '3', '5', '6', '7', '8', '9', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
                'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        Random random = new Random();
        char[] chars = new char[5];
        for (int k = 0; k < stg.length; k++) {
            for (int i = 0; i < chars.length; i++) {
                int index = random.nextInt(strings.length - 1);
                chars[i] = strings[index];
            }
            String s = String.valueOf(chars);
            stg[k] = s;
//            System.out.print(stg[k] + "\t");
        }
        print(stg);
        System.out.println("start");
        for (int i = 0; i < stg.length; i++) {
            //char1=取出第一个字符并转小写

            for (int j = i+1; j < stg.length; j++) {
                char char1 = stg[i].toLowerCase().charAt(0);
                //char2=取出第一个字符并转小写
                char char2 = stg[j].toLowerCase().charAt(0);
                //如果char1>char2   互换位置
                if (char1 > char2) {
                    System.out.println(char1 + "  " + char2);
                    String t = stg[j];
                    stg[j] = stg[i];
                    stg[i] = t;

                }
            }
            print(stg);
        }

    }

    public static void print(String[] stg) {
        for (int i = 0; i < stg.length; i++) {
            System.out.print(stg[i] + "   ");
        }
        System.out.println("===================");
    }

}




