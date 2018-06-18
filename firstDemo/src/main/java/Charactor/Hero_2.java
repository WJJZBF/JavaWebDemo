package Charactor;

;

/**
 * @author wujiaojiao
 * @create 2018-04-25 下午5:28
 **/
public class Hero_2 {
    private static String name; // 姓名
//    private  String name;

    public static float hp; // 血量

    float armor; // 护甲

    int moveSpeed; // 移动速度

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(Float hp) {
        this.hp = hp;
    }

    public Float getHp() {
        return hp;
    }

    public static void hu() {
        System.out.println("oooop");
    }

    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义
     class BattleScore {
        int kill;
        int die;
        int assit;

        public void legendary() {
            if (kill >= 8) {
                System.out.println( name+"超神！");
//                Hero_2 na=new Hero_2();
//                na.setName("huhu");
//                System.out.println(na.getName());
//                na.setHp(2.3f);
//                System.out.println(na.getHp());
                Hero_2.hu();
            } else {
                System.out.println(name + "尚未超神！");
            }
        }
    }

    public static void main(String[] args) {
        Hero_2 garen = new Hero_2();
//        garen.name = "盖伦";
        // 实例化内部类
        // BattleScore对象只有在一个英雄对象存在的时候才有意义
        // 所以其实例化必须建立在一个外部类对象的基础之上
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();
    }
}
