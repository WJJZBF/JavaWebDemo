package Practice_194_iterms;

;

/**
 * @author wujiaojiao
 * @create 2018-05-02 下午6:36
 **/
public class TestString {


        public static void main(String[] args) {
            String str1 = "let there ";

            StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
            System.out.println(sb.length());
            System.out.println(sb.capacity());
            sb.append("be light"); //在最后追加

            System.out.println(sb);

            sb.delete(4,10);//删除4-10之间的字符

            System.out.println(sb);

            sb.insert(4, "there ");//在4这个位置插入 there

            System.out.println(sb);

            sb.reverse(); //反转

            System.out.println(sb);

        }


}
