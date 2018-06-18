package JAVA_practice_demo;

import java.util.*;

;

/**
 * @author wujiaojiao
 * @create 2018-04-17 下午7:46
 **/
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("how cats work");
        Book b2 = new Book("remix ur body");
        Book b3 = new Book("finding emo");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}
class Book implements Comparable{
    String title;
    public Book(String t){
        title=t;
    }
    public int compareTo(Object b){
        Book book=(Book)b;
        return (title.compareTo(book.title));
    }
}
