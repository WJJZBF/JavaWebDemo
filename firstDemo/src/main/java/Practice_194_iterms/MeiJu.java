package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-04-24 下午6:34
 **/
public class MeiJu {
    public static void main(String[] args) {
        for(HeroType each:HeroType.values()) {
            HeroType a = each;

//        HeroType ht = HeroType.WARRIOR;
            switch (a) {
                case TANK:
                    System.out.println("坦克");
                    break;
                case WIZARD:
                    System.out.println("法师");
                    break;
                case ASSASSIN:
                    System.out.println("刺客");
                    break;
                case ASSIST:
                    System.out.println("辅助");
                    break;
                case PUSH:
                    System.out.println("推进");
                    break;
                case RANGED:
                    System.out.println("远程");
                    break;
                case FARMING:
                    System.out.println("打野");
                    break;
                case WARRIOR:
                    System.out.println("近战");
                    break;

            }
        }

    }
}

    enum HeroType {
        TANK, WIZARD, ASSASSIN, ASSIST, WARRIOR, RANGED, PUSH, FARMING
    }
