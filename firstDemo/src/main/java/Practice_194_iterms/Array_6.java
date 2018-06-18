package Practice_194_iterms;


import java.util.Arrays;
import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-04-23 下午8:40
 **/
public class Array_6 {
    public static void main(String[] args) {
        Array_6 array_6 = new Array_6();
        array_6.ar_6();

    }

    public void ar_6() {
        Random random = new Random();
        int[][] arr = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int[] brr = new int[40];
        for (int i = 0; i < 5; i++) {
            System.arraycopy(arr[i], 0, brr, i * 8, 8);

        }
        Arrays.sort(brr);
        for (int i = 0; i < 5;i++) {
            System.arraycopy(brr, i * 8, arr[i], 0, 8);
        }
        System.out.println("**************************************");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
