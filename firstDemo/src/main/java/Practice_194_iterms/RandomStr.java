package Practice_194_iterms;

import java.lang.String;

import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-04-26 下午6:03
 **/
public class RandomStr {
    public static void main(String[] args) {
        char[] strings = {'1', '2', '4', '3', '5', '6', '7', '8', '9', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
                'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        Random random = new Random();
        char[] chars=new char[5];
        for(int i=0;i<chars.length;i++){
            int index=random.nextInt(60);
            chars[i]=strings[index];
        }
        String s=String.valueOf(chars);
        System.out.println(s);

    }


}
