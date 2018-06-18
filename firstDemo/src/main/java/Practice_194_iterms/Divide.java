package Practice_194_iterms;

import java.util.ArrayList;
import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-04-22 下午9:43
 **/
public class Divide {
    public static void main(String[] args) {
        Divide divide_object=new Divide();
        divide_object.divide_func();

    }
    public void divide_func(){
        float first=1,second=1;
        double divide_value=1,number=1;
        for (float i = 1; i <=20 ; i++) {
            for (float j = 1; j <=20 ; j++) {
                if(i%2==0&&j%2==0) {
                    System.out.println(i+" "+j);
                    continue;
                }
                double k=i/j;
                double num=Math.abs(k-0.618);
                if(num<number){
                    number=num;
                    first=i;
                    second=j;
                    divide_value=k;
                }
            }

        }
        System.out.println(first+"/"+second+"="+divide_value);

    }
}
