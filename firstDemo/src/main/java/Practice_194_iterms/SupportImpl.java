package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-24 下午7:10
 **/
interface Healer {
    public abstract void head();

}
public class SupportImpl extends Hero implements Healer {

    public void head(){
        System.out.println("sadsdaf");
    }

}
