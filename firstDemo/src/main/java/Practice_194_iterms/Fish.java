package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-26 下午12:42
 **/
public class Fish extends Animal implements Pet {
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void play() {

    }

    public void eat(int i) {
        System.out.println(name+"吃了" + i + "克鱼食");
    }

    public Fish() {

    }

    @Override
    public void walk() {
        System.out.println(name+"不能走并没有腿");
    }

    public static void main(String[] args) {
        Fish f = new Fish();
        f.setName("鲤鱼");
        f.getName();
        f.walk();
        f.eat(7);
        Cat c = new Cat();
        c.walk();
        c.eat(3);
        Spider anima=new Spider(8);
        anima.eat(67);

    }
}
