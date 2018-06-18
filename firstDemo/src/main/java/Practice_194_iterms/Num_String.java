package Practice_194_iterms;

import com.alibaba.fastjson.JSON;

;

/**
 * @author wujiaojiao
 * @create 2018-04-29 上午1:23
 **/
public class Num_String {
    public void change() {
        String letters = "let there be light";
        String temp0 = letters.replace("let there be light", "Let There Be Light");
        System.out.println(temp0);
    }

    public void count() {
        String writes = "peter piper picked a peck of pickled peppers";
        String[] s = writes.split(" ");
        int count = 0;
        for (String sub : s) {
            if (sub.charAt(0) == 'p') {
                count += 1;
            } else continue;
        }
        System.out.print(count);
    }

    public void two() {
        String strings = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak\n";
//        System.out.println(strings.length());
        strings.substring(35);
        char[] ch=strings.toCharArray();
        ch[35]='T';
        String yumi=String.valueOf(ch);
        System.out.println(JSON.toJSONString(yumi));


    }

    public static void main(String[] args) {
        Num_String num_string = new Num_String();
//        num_string.change();
//        num_string.count();
        num_string.two();
    }
}
