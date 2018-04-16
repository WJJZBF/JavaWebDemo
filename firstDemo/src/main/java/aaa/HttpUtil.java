package aaa;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

;import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

/**
 * @author wujiaojiao
 * @create 2018-04-16 下午9:58
 **/

public class HttpUtil {
    private static Logger log = Logger.getLogger(HttpUtil.class.getClass());
//    public static JSON postAPI(URI uri ,Object data){
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        try{
//            HttpPost httpPost=new HttpPost(uri);
//            //设置消息头
//            httpPost.setHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");//value 需要看请求的消息头的值
//            httpPost.setHeader("Connection","keep-alive");
//            String sessionId = getSessionId();
//            httpPost.setHeader("SessionId", sessionId);
//            //创建消息对象
//            StringEntity entity = new StringEntity(JSON.toJSONString(data), Charset.forName("UTF-8"));
//            entity.setContentEncoding("UTF-8");
//            //发送Json格式的请求
//            // 发送Json格式的数据请求
//            entity.setContentType("application/x-www-form-urlencoded");
//            httpPost.setEntity(entity);
//
//            try {
//                HttpResponse response = httpclient.execute(httpPost);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


    //        }
//    }
    public static JSONObject getAPI(URI uri) throws URISyntaxException, IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(uri);
            log.info("执行API请求" + httpget.getRequestLine());
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        log.error("请求错误，状态码为：" + response.getStatusLine().getStatusCode());
                        throw new ClientProtocolException("意外的状态返回: " + status);
                    }
                }
            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            JSONObject parse = JSONObject.parseObject(responseBody);
            return parse;
        } finally {
            httpclient.close();
        }
    }
}
