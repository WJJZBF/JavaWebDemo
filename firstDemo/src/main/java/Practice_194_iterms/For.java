package Practice_194_iterms;

import java.util.Scanner;

;

/**
 * @author wujiaojiao
 * @create 2018-04-22 下午7:42
 **/
public class For {
    public static void main(String[] args) {
        For fr=new For();
        fr.sum();
    }
    public void sum(){
        int j=0;
        for(int i=0;i<10;i++){
            j=j+(int)Math.pow(2,i);
        }
        System.out.println(j);
    }
}
