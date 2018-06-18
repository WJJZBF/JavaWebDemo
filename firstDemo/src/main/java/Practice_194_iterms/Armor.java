package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-23 下午9:57
 **/
public class Armor extends Item {
    public boolean disposable(){
        return  false;
    }
    int ac = 0;

    public static void main(String[] args) {
        Armor armor_1 = new Armor();
        Armor armor_2 = new Armor();
        armor_1.setAc(15);
        armor_1.setName("布甲");
        armor_1.setPrice(300);
        armor_2.setAc(40);
        armor_2.setName("锁子甲");
        armor_2.setPrice(500);
        System.out.println(armor_1);
        System.out.println(armor_2);
    }

    @Override
    public String toString() {
        return this.getName()+"/ "+this.getPrice()+"/ "+this.getAc();

    }

    public void setAc(int ac) {
        this.ac = ac;
    }
    public int getAc(){
        return ac;
    }


}
