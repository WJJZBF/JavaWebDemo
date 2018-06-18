package Practice_194_iterms;

import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-04-23 上午11:41
 **/
public class Array {
    public static void main(String[] args) {
        Array arr=new Array();
        arr.array();

    }
    public void array(){
        int[] array_num=new int[5];
        int min_num=100;
        for(int index=0;index<array_num.length;index++){
            array_num[index]=(int)(Math.random()*100);
            System.out.println(array_num[index]);
        }
//        System.out.println(array_num);
        for(int i=0;i<array_num.length;i++){
            if(array_num[i]<min_num){
                min_num=array_num[i];
            }
        }
        System.out.println("min_num"+" "+min_num);
//        System.out.println(min_num);
    }
}
