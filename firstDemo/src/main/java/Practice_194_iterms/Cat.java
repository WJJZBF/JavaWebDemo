package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-26 下午12:15
 **/
public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this(" ");
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void play() {

    }

    public void eat(int i) {
        System.out.println(name+"吃了猫粮" + i);
    }

    @Override
    public void walk() {
        System.out.println(name + legs + "只腿");
    }

    public static void main(String[] args) {

    }
}
