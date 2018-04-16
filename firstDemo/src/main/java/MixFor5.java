/**
 * Created by wujiaojiao on 18/2/25.
 */

;

/**
 * @author wujiaojiao
 * @create 2018-02-25 下午7:20
 **/
public class MixFor5 {
    public static void main(String[] args) {
        int x=0;
        int y=30;
        for(int outer=0;outer<3;outer++){
            for(int inter=4;inter>1;inter--){
                x=x+0;
                y=y-2;
                if(x==6){
                    break;
                }
                x=x+3;
            }
            y=y-2;
        }
        System.out.println(x+" "+y);
    }
}
