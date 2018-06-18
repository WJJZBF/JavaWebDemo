package JAVA_practice_demo;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

;import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wujiaojiao
 * @create 2018-04-27 上午11:45
 **/
public abstract class Api_test implements Test {
    @DataProvider(name="addDatas")
    public  Object[][] addDatas(){
        return new Object[][]{
                {"http://www.sosoapi.com/demo/swagger/user/simple/add.htm","1@abc.com","test"}
        };
    }
    @Test(dataProvider = "addDatas")
    public void postTest(String url,String email,String nickName)throws IOException{
        List<NameValuePair> urlparams=new ArrayList<NameValuePair>();
        urlparams.add(new BasicNameValuePair("email",email));
        urlparams.add(new BasicNameValuePair("nickName",nickName));
        HttpUtil httpPost=new HttpUtil();
//        URI uri = URI.create(url);
        System.out.println(httpPost.postAPI(url,new UrlEncodedFormEntity(urlparams)));
    }

}
