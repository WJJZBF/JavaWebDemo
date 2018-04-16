package aaa;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

;

/**
 * @author wujiaojiao
 * @create 2018-04-16 下午11:15
 **/
public class ShopClient {
    public static void main(String[] args) {
        URI uri=URI.create("http://127.0.0.1:8080/shop/getAll");
        try {
            JSONObject Json=HttpUtil.getAPI(uri);
            System.out.println(Json.toJSONString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
