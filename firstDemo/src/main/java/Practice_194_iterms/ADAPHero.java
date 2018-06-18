package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-25 上午11:01
 **/
public class ADAPHero extends Hero_charactor implements AD_interface,AP_interface {
    public void attack(){
//        AD_interface.super.attack();
    }
    public ADAPHero(){
        super("");
        System.out.println("kkkk");
    }
    public void die() {
        System.out.println("jjjjjjjj");

    }

    public static void main(String[] args) {
        ADAPHero adapHero=new ADAPHero();
        adapHero.attack();
    }
}
