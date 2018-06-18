package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-22 下午10:45
 **/
public class Shui_xian_hua_shu {
    public static void main(String[] args) {
        Shui_xian_hua_shu flower=new Shui_xian_hua_shu();
        flower.flower_func();
    }
    public void flower_func(){
        for (int num = 100; num <=999 ; num++) {
            int first=num/100;
            int second=(num%100)/10;
            int third=num%10;
            if(num==Math.pow(first,3)+Math.pow(second,3)+Math.pow(third,3)){
                System.out.println(num);
            }
        }
    }
}
