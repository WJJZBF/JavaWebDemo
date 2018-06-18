package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-23 下午10:35
 **/
public class Support extends Hero {
//    public Support(String heroName,float heroHP,float heroArmor,int heroMoveSpeed) {
//        super("yu",6.2f,8.4f,23);
////        System.out.println(this.name + " " + this.hp + " " + this.armor + " " + this.movespeed);
//    }

    public void heal() {
        System.out.println("加油");
    }

    public void heal(Hero h) {
        h.hp = hp + 4;
        System.out.println("八嘎  " + h.hp);
    }

    public void heal(Hero h, int hp) {
        h.hp = this.hp + 8;

        System.out.println("努力 " + h.hp);
    }

    public static void main(String[] args) {
        Support s = new Support();
        Hero he = new Hero();
        s.heal(he);
        s.heal(he, 2);
        s.heal();
    }
}
