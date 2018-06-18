package JAVA_practice_demo;

import java.util.HashMap;

;

/**
 * @author wujiaojiao
 * @create 2018-04-17 下午8:11
 **/
public class Hash_Map {
    public static void main(String[] args) {
        new Hash_Map().go();
    }
    public void go(){
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("jiaojiao",26);
        map.put("baifeng",29);
        System.out.println(map);
        System.out.println(map.get("jiaojiao"));
    }
}
