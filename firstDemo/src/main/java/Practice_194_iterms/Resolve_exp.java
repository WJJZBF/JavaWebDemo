package Practice_194_iterms;
import java.io.IOException;


/**
 * @author wujiaojiao
 * @create 2018-05-03 下午6:35
 **/
public class Resolve_exp {
    public int method(){
        try {
            int a=1;
            System.out.println(a);
        } catch(Exception e) {
            int b=2;
            System.out.println(b);

        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Resolve_exp().method());
    }
}
