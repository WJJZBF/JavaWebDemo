package Practice_194_iterms;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

;

/**
 * @author wujiaojiao
 * @create 2018-05-06 下午7:21
 **/
public class ListForArray {
    public static void main(String[] args) {
        ListForArray lfa = new ListForArray();
//        lfa.toArrays();
        lfa.removeArrays();

    }

    public void removeArrays() {
        List<Hero> hr = new ArrayList<>();
        String name = "hero ";
        for (int i = 0; i < 20; i++) {
            Hero hero = new Hero(name + i);
            hr.add(hero);
            if (i % 8 == 0 && i>=8) {
                hr.remove(hero);
                System.out.println("remove "+i);
            }

        }

        System.out.println(hr);
    }


    public void toArrays() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Integer[] nums = list.toArray(new Integer[]{});
        System.out.println(JSON.toJSONString(nums));
    }
}
