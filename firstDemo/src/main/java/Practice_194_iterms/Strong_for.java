package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-23 下午4:05
 **/
public class Strong_for {
    public static void main(String[] args) {
        Strong_for for_=new Strong_for();
        for_.func_();

    }
    public void func_(){
        int[] in=new int[]{18,2,34,12,66,23};
        int max_n=0;
        for(int each:in){
            if(each>max_n){
                max_n=each;
            }
        }
        System.out.println(max_n);
    }
}
