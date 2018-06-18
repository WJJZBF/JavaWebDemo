package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-05-08 下午3:23
 **/
public class MyHero {
    public String name;
    public float hp;

    public int damage;

    public MyHero() {

    }

    public MyHero(String name) {

        this.name = name;
    }

    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    public MyHero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    //回血
    public void recover(){
        hp=hp+1;
    }

    //掉血
    public void hurt(){
        hp=hp-1;
    }

    public void attackHero(MyHero h) {
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }
}
