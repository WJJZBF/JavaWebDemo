/**
 * Created by wujiaojiao on 18/3/4.
 */

;

/**
 * @author wujiaojiao
 * @create 2018-03-04 下午5:24
 **/
class M {
    boolean frighten(int d){
        System.out.println("arrrgh");
        return  true;
    }
}
class B extends M{
    boolean frighten(int x){
        System.out.println("a bite?");
        return  false;
    }
}
class C extends M {
    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }
}

public class A {
    public static void main(String[] args) {
        M[] a = new M[3];
        a[0] = new B();
        a[1] = new C();
        a[2] = new M();
        for (int i=0; i < 3; i++) {
            a[i].frighten(i);
        }
    }
}

