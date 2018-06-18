package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-25 下午7:46
 **/
public abstract class Animal {
    protected int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    //受保护的构造函数，导致该类不能在其他packge下的类里面创建实例，在同一个packge下的其他类里可以创建实例
    protected Animal(int legs) {
        this.legs = legs;
    }
    public Animal(){

    }

    public abstract void eat(int i);

    public void walk() {
        System.out.println("动物是如何行走的" + legs);
    }

    public static void main(String[] args) {
//        Animal animal=new Animal(8);
//        animal.setLegs(9);
//        animal.walk();
        float t=3.14f;
        String st=String.valueOf(t);
        System.out.println(st);
//        Float tts=new Float(t);
//        String s= tts.toString();
//        System.out.println(s);
        String str="90";
        float in=Float.parseFloat(str);
        System.out.println(in);
    }
}
