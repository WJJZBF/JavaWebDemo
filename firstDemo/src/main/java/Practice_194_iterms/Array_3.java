package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-23 下午1:26
 **/
public class Array_3 {
    public static void main(String[] args) {
        Array_3 ar = new Array_3();
        ar.ar_func();

    }

    public void ar_func() {
        int[] arry = new int[5];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = (int) (Math.random() * 100);
            System.out.println(arry[i]);
        }
//        int min_num =
        for (int k = 0; k < arry.length; k++) {
            for (int j = k + 1; j < arry.length; j++) {
                if (arry[j] < arry[k]) {
                    int temp=arry[k];
                     arry[k]= arry[j];
                     arry[j]=temp;

                }
            }
        }
        System.out.println("正序。。。。。。。。");
        for (int x=0;x<arry.length;x++){

            System.out.println(arry[x]);
        }
        System.out.println("倒序。。。。。。。。");
        for (int q=0;q<arry.length;q++) {
            for (int w = 0; w < arry.length-q-1; w++) {
                if (arry[w] <arry[w+1]) {
                    int tem = arry[w+1];
                    arry[w+1] = arry[w];
                    arry[w] = tem;
                }
            }
        }
        for (int y=0;y<arry.length;y++)
            System.out.println(arry[y]);

    }

}
