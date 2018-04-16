package aaa;/**
 * Created by wujiaojiao on 18/2/24.
 */

;

/**
 * @author wujiaojiao
 * @create 2018-02-24 下午3:23
 **/
public class Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.c();

//        int y=1;
//        int x=0;
//        int result=0;
//
//        while (x<6){
//            Triangle[] ta=new Triangle[4];
//
//            ta[x]=new Triangle();
//            ta[x].height=(x+1)*2;
//            ta[x].length=x+4;
//            ta[x].setArea();
//            System.out.print("triangle"+x+",area");
//            System.out.println("="+ta[x].area);
//            x=x+1;
//
    }

    public void B() {
        int[] c = {2, 3, 4, 5};

        for (int x : c) {
            System.out.println(x);
        }
    }

    public void c() {
        int[] arr = {2, 3, 4, 5};
        int length = arr.length;
        int index = 0;
        while (index < length) {
            System.out.println(arr[index]);
            index++;
        }

    }

    public void  d() {
        int[] arr = {2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
