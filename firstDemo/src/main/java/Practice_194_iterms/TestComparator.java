package Practice_194_iterms;

import java.util.*;

;

/**
 * @author wujiaojiao
 * @create 2018-05-08 下午3:25
 **/
public class TestComparator {
    public static void main(String[] args) {
        List<MyHero> heros = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            heros.add(new MyHero("hero" + i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println(heros);
        Comparator<MyHero> c = new Comparator<MyHero>() {
            @Override
            public int compare(MyHero o1, MyHero o2) {
                if (o1.hp >= o2.hp)
                    return 1;
                else
                    return -1;

            }
        };
        Collections.sort(heros,c);
        System.out.println(heros);
    }
}
