package Practice_194_iterms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

;

/**
 * http://how2j.cn/k/array/array-init/281.html#step2184
 * 数组反转
 *
 * @author wujiaojiao
 * @create 2018-04-23 下午12:04
 **/
public class Array_2 {
    public static void main(String[] args) {
        Array_2 arr_2 = new Array_2();
        arr_2.arry();

    }

    public void arry() {
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println(i + " " + a[i]);
        }

        for (int index = 0; index < a.length / 2; index++) {
            int m = a[index];
            a[index] = a[a.length - 1 - index];
            a[a.length - 1 - index] = m;
        }

        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + "\t");
        }
    }
}
