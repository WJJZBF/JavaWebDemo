package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-05-08 下午3:58
 **/
public class HisHero implements Comparable<HisHero>{
    public String name;
    public float hp;

    public int damage;

    public HisHero() {

    }

    public HisHero(String name) {

        this.name = name;
    }

    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    public HisHero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public int compareTo(HisHero o) {
        if(o.damage>=damage)
            return -1;
        else
            return 1;
    }
}
