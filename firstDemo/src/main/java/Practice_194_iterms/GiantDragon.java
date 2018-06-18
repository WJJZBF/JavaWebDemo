package Practice_194_iterms;

;

/**单例模式懒汉式
 * @author wujiaojiao
 * @create 2018-04-24 下午6:23
 **/
public class GiantDragon {
    private GiantDragon() {

    }
    private static GiantDragon instance;
    public static GiantDragon getInstance(){
        if(null==instance){
            GiantDragon instance=new GiantDragon();
        }
        return instance;
    }

}
 class TestGiantDragon{
     public static void main(String[] args) {
         GiantDragon G1=GiantDragon.getInstance();
         GiantDragon G2=GiantDragon.getInstance();
         System.out.println(G1==G2);
     }
}
