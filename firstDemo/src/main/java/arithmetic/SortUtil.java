package arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

;

/**
 * @author wujiaojiao
 * @create 2018-04-13 下午10:29
 **/
public class SortUtil {
    public static void main(String[] args) {
        SortUtil util = new SortUtil();
        List<Integer> list = util.addList();
        util.sort(list);
        util.print(list);


    }

    private  void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }

    private  void sort(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size -1; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp;
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public List<Integer> addList() {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num;
            num = random.nextInt(100);
            list.add(num);
        }
        return list;
    }

}
