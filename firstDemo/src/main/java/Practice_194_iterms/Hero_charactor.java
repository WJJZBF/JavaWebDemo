package Practice_194_iterms;

;

/**
 * 练习多态：同一类型，同一方法，最后执行的结果状态不一样－－http://how2j.cn/k/interface-inheritance/interface-inheritance-polymorphic/315.html#step2273
 * 练习类型转换－－http://how2j.cn/k/interface-inheritance/interface-inheritance-casting/308.html#step2268
 *
 * @author wujiaojiao
 * @create 2018-04-24 下午9:32
 **/
public class Hero_charactor {
    String name;
    public static void battleWin() {
        System.out.println("hero");
    }

    public Hero_charactor(String name) {
        this.name = name;

    }

    public void kill(Mortal m) {
        m.die();
    }


    public static void main(String[] args) {


//        Hero_charactor hero_charactor = new Hero_charactor();
//        ADHero support_charactor = new ADHero();
//        hero_charactor = support_charactor;
//        support_charactor = (ADHero) hero_charactor;
//        System.out.println(hero_charactor instanceof ADHero);
//        System.out.println(support_charactor instanceof Hero_charactor);

//        Hero_charactor adhero=new ADHero();
//        adhero.die();
//        Hero_charactor aphero=new APHero();
//        aphero.die();
//        Hero_charactor adaphero=new ADAPHero();
//        adaphero.die();


//        Hero_charactor gl=new Hero_charactor();
//        ADHero adhero=new ADHero();
//        APHero aphero=new APHero();
//        ADAPHero adaphero=new ADAPHero();
//        gl.kill(adhero);
//        gl.kill(aphero);
//        gl.kill(adaphero);


    }
}
