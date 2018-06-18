package JAVA_practice_demo;

import java.io.Serializable;

;

/**
 * @author wujiaojiao
 * @create 2018-04-16 下午5:22
 **/
public class GameCharator implements Serializable {
    int power;
    String type;

    public GameCharator(int p, String t) {
        power = p;
        type = t;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }
}
