package Practice_194_iterms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-05-08 下午3:59
 **/
public class TestComparable {
    public static void main(String[] args) {
//
        String str=null;
        List<HisHero> heroes=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i <10 ; i++) {
            heroes.add(new HisHero("hero"+i,r.nextInt(100),r.nextInt(100)));
        }
        System.out.println(heroes);
        Collections.sort(heroes);
        System.out.println(heroes);
    }
}
