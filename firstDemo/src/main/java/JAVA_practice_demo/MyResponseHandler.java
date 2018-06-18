package JAVA_practice_demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

;import java.io.IOException;

/**
 * @author wujiaojiao
 * @create 2018-04-28 上午12:08
 **/
public class MyResponseHandler implements ResponseHandler<String> {
    private static Logger log = Logger.getLogger(HttpUtil.class.getClass());

    public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
        int status = response.getStatusLine().getStatusCode();
        if (status >= 200 && status < 300) {
            HttpEntity entity = response.getEntity();
            return entity != null ? EntityUtils.toString(entity) : null;
        } else {
            log.error("请求错误，状态码为：" + response.getStatusLine().getStatusCode());
            throw new ClientProtocolException("意外的状态返回: " + status);
        }
    }
}
