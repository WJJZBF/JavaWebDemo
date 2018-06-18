package Charactor;

;

/**
 * @author wujiaojiao
 * @create 2018-04-24 下午6:00
 **/
public class Hero_1 {
    public String name =Hero_1.getName("属性声明") ;

    public Hero_1(){
        name = Hero_1.getName("构造方法");
    }
    {
        name = Hero_1.getName("初始化块");
    }

    public static String getName(String pos){
        String result= "name "+pos;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        new Hero_1();
    }

}
