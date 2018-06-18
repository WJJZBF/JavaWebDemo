package Practice_194_iterms;

;

/**递归
 * @author wujiaojiao
 * @create 2018-05-03 下午11:34
 **/
public class DiGui {
    public static void main(String[] args) {
        System.out.println(leiJia(10));
    }

    public  static  int  leiJia(int n) {
        if (n == 1) {
            return 1;
        }
        return n + leiJia(n - 1);
    }
}
