package Practice_194_iterms;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

;import java.util.Random;

/**
 * @author wujiaojiao
 * @create 2018-04-23 下午4:12
 **/
public class Array_4 {
    public static void main(String[] args) {
        Array_4 array_4 = new Array_4();
        array_4.aaaa();

    }

    public void aaaa() {
        Random random = new Random();
//        int[] arr1 = new int[random.nextInt(5) + 5];
//        int[] arr2 = new int[random.nextInt(5) + 5];
        int[] arr1 = new int[(int)( Math.random() * 5) + 5];
        int[] arr2 = new int[(int) (Math.random() * 5 )+ 5];
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
        }
        int num_3 = arr1.length + arr2.length;
        int[] c = new int[num_3];
        System.arraycopy(arr1, 0, c, 0, arr1.length);
        System.arraycopy(arr2, 0, c, arr1.length, arr2.length);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }
    }

    public void array_4_func() {
            int num_1 = (int) (Math.random() * 5+5);
            int num_2 = (int) (Math.random() * 5+5);
                int[] a = new int[num_1];
                int[] b = new int[num_2];
                for (int j = 0; j < a.length; j++) {
                    a[j] = (int) (Math.random() * 100);
                }
                System.out.print("数组1： ");
                for (int num1 = 0; num1 < a.length; num1++) {
                    System.out.print(a[num1] + " ");

                }
                System.out.print("／ ");
                for (int k = 0; k < b.length; k++) {
                    b[k] = (int) (Math.random() * 100);
                }
                System.out.print("数组2: ");
                for (int num2 = 0; num2 < b.length; num2++) {
                    System.out.print(b[num2] + " ");
                }
                System.out.print("／ ");
                int num_3 = num_1 + num_2;
                int[] c = new int[num_3];
                System.arraycopy(a, 0, c, 0, num_1);
                System.arraycopy(b, 0, c, num_1, num_2);
                System.out.print("数组三： ");
                for (int i = 0; i < c.length; i++) {
                    System.out.print(c[i] + ", ");
                }
            }


}