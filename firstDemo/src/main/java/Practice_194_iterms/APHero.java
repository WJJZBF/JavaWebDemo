package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-25 上午11:00
 **/
public class APHero extends Hero_charactor implements Mortal {
    public void die(){
        System.out.println("加油啦");
    }
    public static void battleWin(){
        System.out.println("瞎说");

    }
    public APHero(){
        super("");
        System.out.println("wancheng");

    }


    public static void main(String[] args) {
        Hero_charactor bw=new ADHero();
        APHero.battleWin();
        Hero_charactor.battleWin();
        bw.battleWin();
    }
}
