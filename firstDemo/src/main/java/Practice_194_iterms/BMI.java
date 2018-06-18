package Practice_194_iterms;

;import java.util.Scanner;

/**
 * @author wujiaojiao
 * @create 2018-04-20 下午6:38
 **/
public class BMI {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入你的体重：");
        float weight=reader.nextFloat();
        System.out.println("请输入你的身高:");
        float hight=reader.nextFloat();
        float bmi=weight/(hight*hight);
        System.out.println("当前BMI为:"+bmi);
        String word="您的身体状态是";
//        if(bmi<18.5){
//            System.out.println(word+"体重过轻");
//        }else if(bmi>=18.5&bmi<24){
//            System.out.println(word+"体重正常");
//        }else if(bmi>=24&bmi<27){
//            System.out.println(word+"体重过重");
//        }else if(bmi>=27&bmi<30){
//            System.out.println(word+"轻度肥胖");
//        }else if(bmi>=30&bmi<35){
//            System.out.println(word+"中度肥胖");
//        }else{
//            System.out.println(word+"重度肥胖");
//        }
        //改良版
        String status="";
        if(bmi<18.5){
            status="体重过轻";
        }else if(bmi<24){
            status="体重正常";
        }else if(bmi<27){
            status="体重过重";
        }else if(bmi<30){
            status="轻度肥胖";
        }else if(bmi<35){
            status="中度肥胖";
        }else{
            status="重度肥胖";
        }
        System.out.println(word+status);
    }
}
