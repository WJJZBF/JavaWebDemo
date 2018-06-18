package Practice_194_iterms;

import com.alibaba.fastjson.JSON;

import java.util.LinkedList;
import java.util.Queue;

;

/**
 * @author wujiaojiao
 * @create 2018-05-05 下午3:22
 **/
public class LinkLIst {
    public static void main(String[] args) {
//        LinkLIst.link();
        LinkLIst.queueFunc();
    }

    public static void link() {
        LinkedList<Hero> linkedList = new LinkedList<Hero>();
        linkedList.addLast(new Hero("wujiaojiao"));
        linkedList.addLast(new Hero("zhaobaifeng"));
        linkedList.addFirst(new Hero("fangvaiqin"));
        System.out.println(JSON.toJSONString(linkedList));
        System.out.println(JSON.toJSONString(linkedList.getFirst()));
        System.out.println(JSON.toJSONString(linkedList.getLast()));
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(JSON.toJSONString(linkedList));

    }

    public static void queueFunc() {
        Queue<Hero> qu = new LinkedList<Hero>();
        qu.offer(new Hero("JENNY"));
        qu.offer(new Hero("HHU"));
        qu.offer(new Hero("uuujuju"));
        System.out.println(JSON.toJSONString(qu));
        System.out.println(JSON.toJSONString(qu.poll()));
        System.out.println(JSON.toJSONString(qu.peek()));
    }

}
