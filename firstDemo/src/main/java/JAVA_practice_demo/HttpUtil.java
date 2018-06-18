package JAVA_practice_demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author wujiaojiao
 * @create 2018-04-16 下午9:58
 **/

public class HttpUtil {
    private static Logger log = Logger.getLogger(HttpUtil.class.getClass());

    public String postAPI(String url, HttpEntity entity) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        post.setEntity(entity);
        CloseableHttpResponse response = httpclient.execute(post);
        System.out.println("Response code:" + response.getStatusLine().getStatusCode());
        try {
            String resString = EntityUtils.toString(response.getEntity());
            return JSON.toJSONString(resString);
        } finally {
            response.close();
        }
    }

    public static JSONObject getAPI(URI uri) throws URISyntaxException, IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(uri);
            log.info("执行API请求" + httpget.getRequestLine());
//            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
//                public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
//                    int status = response.getStatusLine().getStatusCode();
//                    if (status >= 200 && status < 300) {
//                        HttpEntity entity = response.getEntity();
//                        return entity != null ? EntityUtils.toString(entity) : null;
//                    } else {
//                        log.error("请求错误，状态码为：" + response.getStatusLine().getStatusCode());
//                        throw new ClientProtocolException("意外的状态返回: " + status);
//                    }
//                }
//            };
            MyResponseHandler myResponseHandler = new MyResponseHandler();
            String responseBody = httpclient.execute(httpget, myResponseHandler);
            JSONObject parse = JSONObject.parseObject(responseBody);
            return parse;
        } finally {
            httpclient.close();
        }
    }
}
