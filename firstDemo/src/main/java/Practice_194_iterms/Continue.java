package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-22 下午8:14
 **/
public class Continue {


    public static void main(String[] args) {
        Continue c=new Continue();
        c.ctinue();
    }
    public void ctinue(){
        for(int i=1;i<10;i++){
            if(i%2==0)
                continue;
                System.out.println(i);

        }
    }
}
