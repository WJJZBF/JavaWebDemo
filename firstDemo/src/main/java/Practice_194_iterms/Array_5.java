package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-23 下午6:49
 **/
public class Array_5 {

    public static void main(String[] args) {
        Array_5 array_5 = new Array_5();
        array_5.ar_5_func();

    }

    public void ar_5_func() {
        int array_2[][]= new int[5][6];
        int hang = 0, colume = 0;
        int max_number = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                array_2[i][j] = (int) (Math.random() * 100);
            }
        }
        for(int[] row:array_2){
            for(int each:row){
                System.out.print(each+"\t");
            }
            System.out.println();
        }
        System.out.println("####");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (array_2[i][j] > max_number) {
                    max_number = array_2[i][j];
                    hang = j;
                    colume = i;
                }
            }
        }
        System.out.print(max_number);
        System.out.println("/" + hang + "/" + colume);

    }
}
//    public static void main(String[] args) {
//        int a[][] = new int[5][5];
//        for (int j = 0; j < a.length; j++) {
//            for (int i = 0; i < a[j].length; i++) {
//                a[j][i] = (int) (Math.random() * 100);
//            }
//        }
//        for (int[] row : a) {
//            for (int each : row) {
//                System.out.print(each + "\t");
//            }
//            System.out.println();
//        }
//        int max = -999;
//        int maxrow = -1;
//        int maxeach = -1;
//        for (int j = 0; j < a.length; j++) {
//            for (int i = 0; i < a[j].length; i++) {
//                if (max < a[j][i]) {
//                    max = a[j][i];
//                    maxrow = j;
//                    maxeach = i;
//                }
//            }
//        }
//        System.out.print("数组中最大的值为" + max + "其坐标为a[" + maxrow + "][" + maxeach + "]");
//    }
//}
