package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-20 下午4:19
 **/
public class Hero {
    String name;
    float hp;
    float armor;
    float movespeed;
    byte i = -127;
    int m = 'a' + 'b';
    double d = 5.234559087;
    float t = 2.89f;

    public Hero(String name) {
    this.name=name;
    }

    public Hero(String name, float hp) {
        System.out.println(name + " " + hp);
    }

    public Hero(String name, float hp, float armor, int movespeed) {
        this(name, hp);
        this.armor = armor;
        this.movespeed = movespeed;
        System.out.println(name + " " + hp);
    }

//    public Hero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed) {
//        this.name = heroName;
//        this.hp = heroHP;
//        this.armor = heroArmor;
//        this.movespeed = heroMoveSpeed;
//        System.out.println(this.name + " " + this.hp + " " + this.armor + " " + this.movespeed);
//
//
////        System.out.println(t);
//    }

    public Hero() {

    }

    public static void main(String[] args) {
        new Hero("ok", 2.23f, 2.56f, 3);


    }

    public void legendary() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public byte getI() {
        return i;
    }

    public void setI(byte i) {
        this.i = i;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }

    public Float getHp() {
        return hp;
    }

    public void recovery(float blood) {

    }
}
