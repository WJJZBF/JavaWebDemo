package aaa;

import java.io.*;
import java.lang.*;

/**
 * @author wujiaojiao
 * @create 2018-04-16 下午4:15
 **/

public class Duck {
    public static void main(String[] args) {
        GameCharator one = new GameCharator(50, "jiaojiao");
        GameCharator two = new GameCharator(200, "baifeng");
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        one = null;
        two = null;
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharator oneR = (GameCharator) is.readObject();
            GameCharator twoR = (GameCharator) is.readObject();
            System.out.println();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
