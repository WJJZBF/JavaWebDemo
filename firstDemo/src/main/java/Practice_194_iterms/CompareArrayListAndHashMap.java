package Practice_194_iterms;

import com.alibaba.fastjson.JSON;

import java.util.*;

;

/**
 * @author wujiaojiao
 * @create 2018-05-06 下午12:38
 **/
public class CompareArrayListAndHashMap {
    List<Hero> list = new ArrayList<Hero>();
    HashMap<String, Hero> hashMap = new HashMap<String, Hero>();

    public void arrayListFunc() {

        long start = System.currentTimeMillis();
        for (Hero each : list) {
            if (each.getName().equals("hero-5555")) {
                System.out.println(each.getName());
            }
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("list 所花时间：" + time);
    }


    public void hashMapFunc() {
        long start = System.currentTimeMillis();
//        for (Map.Entry<Integer, Hero> integerHeroEntry : hashMap.entrySet()) {
//            Hero hero = integerHeroEntry.getValue();
//            if (hero.getName().equals("hero-5555")) {
////                System.out.println(integerHeroEntry.getKey());
//            }
//        }
        Hero hero = hashMap.get("hero-5555");
        System.out.println(hero.getName());
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("hashmap 所花时间：" + time);

    }

    public static void main(String[] args) {
        CompareArrayListAndHashMap cah = new CompareArrayListAndHashMap();
        cah.initHero();
        cah.hashMapFunc();
        cah.arrayListFunc();
    }

    private void initHero() {
        long start = System.currentTimeMillis();

        String str = "hero-";
        int length = 300 * 10000;
        for (int i = 0; i < length; i++) {
            Hero hero = new Hero(str + i);
            list.add(hero);
            hashMap.put(str + i, hero);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("initHero 所花时间：" + time);
    }
}
