package Practice_194_iterms;


import java.util.HashMap;

import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.TreeSet;

;

/**
 * @author wujiaojiao
 * @create 2018-05-08 下午2:32
 **/
public class HashMapOrTable {
    public static void main(String[] args) {
        HashMapOrTable mot = new HashMapOrTable();
//        mot.map();
//        mot.fanZhuan();
//        mot.treeSet();
        mot.linkHashSet();
    }

    public void map() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put(null, "1234");
        System.out.println(hm.get(null));
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put(null, "nj");
        ht.put("hj", null);
    }

    public HashMap<String, String> fanZhuan() {
        HashMap<String, String> hmHero = new HashMap<>();
        hmHero.put("abc", "物理英雄");
        hmHero.put("apc", "魔法英雄");
        hmHero.put("t", "坦克");
        System.out.println(hmHero);
        HashMap<String, String> newMap = new HashMap<>();
        for (String each : hmHero.keySet()) {
            newMap.put(hmHero.get(each), each);
        }
        System.out.println(newMap);
        return newMap;
    }

    public void treeSet() {
        TreeSet<Integer> hst = new TreeSet<>();
        hst.add(89);
        hst.add(0);
        hst.add(23);
        System.out.println(hst);
    }
    public void linkHashSet(){
        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();
        //LinkedHashSet中的数据是按照插入顺序存放
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);
        numberSet2.add(88);
        System.out.println(numberSet2);
    }
}
