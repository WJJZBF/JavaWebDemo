package com.zhaobf.springbootmybatis.service.process;

import com.alibaba.fastjson.JSON;
import com.zhaobf.springbootmybatis.service.param.baseParam.BaseParam;
import com.zhaobf.springbootmybatis.service.param.login.LoginParams;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

;
/**
 esign登录
 * @author wujiaojiao
 * @create 2018-05-20 下午3:09
 **/
public class EsignLogin {
    @Test
    public static String login(String account,String pwd) {
        LoginParams params = new LoginParams();
        params.setAccount(account);
        params.setPwd(pwd);
        params.setType(0);
        params.setSource(BaseParam.SOURCE);
        String bodyString = JSON.toJSONString(params);
        Response responseForLogin = given()
                .contentType("application/json")
                .request().body(bodyString)
                .post("http://121.40.239.205:8000/service/rest/v1/login");
        responseForLogin.print();
        String json = responseForLogin.asString();
        JsonPath jsonPath = new JsonPath(json);
        String sessionid = responseForLogin.getCookie("SESSION");


        Assert.assertEquals(true, jsonPath.getBoolean("success"));
        Assert.assertEquals("成功", jsonPath.get("msg"));
        Assert.assertEquals(null, jsonPath.getString("total"));
        Assert.assertEquals(false, jsonPath.getBoolean("errShow"));
        Assert.assertEquals(0, jsonPath.getInt("errCode"));
        Assert.assertEquals("esignWeb201703062034", jsonPath.get("data.equipId"));
        if (jsonPath.get("data.token") != null) {
            System.out.println(jsonPath.getString("data.token"));
        }
        Assert.assertEquals(true, jsonPath.getBoolean("data.newVersion"));
        return sessionid;
    }

}
