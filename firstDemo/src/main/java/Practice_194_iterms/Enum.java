package Practice_194_iterms;

import com.alibaba.fastjson.JSON;
import java.util.Random;

;
/**
 * 1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
 * <p>
 * 2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
 * <p>
 * 要求： 分别使用多层for循环 和 递归解决上述问题
 */

/**
 * 穷举法
 *
 * @author wujiaojiao
 * @create 2018-04-28 下午1:31
 **/
public class Enum {
    public static void main(String[] args) {
        char[] chars = new char[3];
        Random random = new Random();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (random.nextInt(26) + 97);
        }
        String password = String.valueOf(chars);
        System.out.println(JSON.toJSONString(password));
        char[] list = new char[26];
        for (int i = 0; i < 26; i++) {
            list[i] = (char) (i + 97);
        }//穷举法
        char[] chars1 = new char[3];
        for (int i = 0; i < 26; i++) {
            chars1[0] = list[i];//先确定字符串第一个字符
            for (int j = 0; j < 26; j++) {
                chars1[1] = list[j];//确定字符串第二个字符
                for (int k = 0; k < 26; k++) {
                    chars1[2] = list[k];//确定字符串第三个字符
                    String psd = String.valueOf(chars1);//将三个字符合为字符串
                    if (psd.equals(password)) {//破解码与密码进行匹配
                        System.out.println("we find it");
                        System.out.println(JSON.toJSONString(password));
                        System.out.println(i+" "+j+" "+k);
                    } else continue;

                }
            }
        }
    }
}
