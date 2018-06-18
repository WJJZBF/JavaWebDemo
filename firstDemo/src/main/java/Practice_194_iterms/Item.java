package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-20 下午3:54
 **/
public abstract class Item {
   private int price;
   private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    public void effect(){
        System.out.println("uuuu");
    }
    @Override
    public String toString(){
        return name+" :"+price;
    }
    @Override
    public void finalize(){
        System.out.println("当前对象正在被回收");
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Item){
//            Item i=(Item)o;
          return  this.price==((Item) o).price;
        }
        return false;
    }


    //疑问点？？？？？？？
    public abstract boolean disposable();
    public static void getdisposable(boolean disposable){
        System.out.println(disposable);
    }

    //
    public static void main(String[] args) {
//        Item blood = new Item();
//        blood.name="a";
//        blood.price=20;
//
//        Item grass = new Item();
//        grass.name="b";
//        grass.price=200;
//        Item sword = new Item();
//        sword.name="c";
//        sword.price=300;
//        blood.setName("血瓶");
//        blood.setPrice(30);
//        grass.setName("草鞋");
//        grass.setPrice(300);
//        sword.setName("长剑");
//        sword.setPrice(250);
//        Item mp=new MagicPotion();
//        Item ar=new Armor();
//        MagicPotion.getdisposable(mp);
//        .getdisposable(ar);
    }

}
