package aaa;/**
 * Created by wujiaojiao on 18/2/22.
 */

;

/**
 * @author wujiaojiao
 * @create 2018-02-22 下午5:32
 **/
public class Player {
    int number=0;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("I guess"+number);

    }
}
