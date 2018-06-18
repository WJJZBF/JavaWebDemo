package com.zhaobf.springbootmybatis.service.process;

import com.alibaba.fastjson.JSON;
import com.zhaobf.springbootmybatis.service.param.baseParam.BaseParam;
import com.zhaobf.springbootmybatis.service.param.sign.DocSignInfoParams;
import com.zhaobf.springbootmybatis.service.param.sign.PosArrayParams;
import com.zhaobf.springbootmybatis.service.param.sign.SignParams;
import com.zhaobf.springbootmybatis.service.returnValue.seal.ResponseForSeals;
import com.zhaobf.springbootmybatis.service.returnValue.seal.Seals;
import io.restassured.response.Response;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import static io.restassured.RestAssured.*;

/**
 *
 * 待我签署
 * @author wujiaojiao
 * @create 2018-05-08 下午8:05
 **/
public class WaitToSign {


    //    @Test
    //    public void getHttpTest1() {
//        Response response = given().get("http://www.baidu.com");
//        response.print();
//    }
//    @Test
//    public void getHttpTest2(){
//        Response response=given()
//                // 配置SSL 让所有请求支持所有的主机名，https我们需要加上ssl的配置，让所有请求支持所有的主机名
//                .config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
//                .param("q","自动化测试")
//                .param("start",0)
//                .param("count",2)
//                .get("https://api.douban.com/v2/book/search");
//        response.print();
////    }
//    @Test
//    public void postHttpTest1() {
//        final String bodyString = "{\"account\":\"18667021101\",\"pwd\":\"111111q\",\"type\":0,\"source\":\"esign\"}";
//        Response response = given()
//                .contentType("application/json")
//                .request().body(bodyString)
//                .expect().
//                        statusCode(200).
//                        body(
//                                "success", equalTo(true),
//                                "msg", equalTo("成功"),
//                                "total", equalTo(null),
//                                "errCode", equalTo(0),
//                                "errShow", equalTo(false),
//                                "data.equipId", equalTo("esignWeb201703062034"),
////                                "data.token", equalTo(response.get("data.token")),
//                                "data.newVersion", equalTo(true)
//                        )
//                .when()
//                .post("http://121.40.239.205:8000/service/rest/v1/login");
//        System.out.println(response.getBody().asString());//取出获取Response body，并转成String类型
//        response.print();//打印reponse的body
//        int statusCode = response.getStatusCode();
//        System.out.println(statusCode);
//
//        // 获取Response 的所有 headers 并输出
//        Headers header = response.getHeaders();
//        System.out.println(header.toString());
//
//        // 获取Response中header名为Content-Type的值
//        String contentType = response.getHeader("Content-Type");
//        System.out.println("Content-Type:" + contentType);
//
//        // 校验某个Header 是否存在
//        System.out.println(header.hasHeaderWithName("Server"));
//
//        // 如果Response 的headers不为空则返回true
//        System.out.println(header.exist());
//
//        Map<String, String> cookiesMap = response.cookies();
//        for (String key : cookiesMap.keySet()) {
//            System.out.println(key + ":" + cookiesMap.get(key));
//        }
//
//
//    }
    static String sessionId = null;
    String participantId = null;
    String flowDocId = null;
    List<Seals> seals;

    @Test
    public void sign() {
        sessionId=EsignLogin.login("15757136032","111111q");
        participantId = getSignFlowList();
        flowDocId = getFlowDocId();
        seals=GetSeal.getSealForSign(sessionId);
        String stringBody =Signing.buildSignParam(participantId, flowDocId,seals);//调用签署方法
        Response responseForSign = given()
                .contentType("application/json")
                .cookie("SESSION", sessionId)
                .request().body(stringBody)
                .post("http://121.40.239.205:8000/service/rest/v1/signflow/sign");
        Assert.assertEquals(200, responseForSign.getStatusCode());
        String paperSign = responseForSign.asString();
        System.out.println(paperSign);
    }

    //获取待我签文件列表
    public String getSignFlowList() {
        System.out.println("登陆成功，点击待我签");
        Response responseForSign = given()
                .cookie("SESSION", sessionId)
                .param("page", 1)
                .param("pageSize", 10)
                .param("status", 2)
                .param("source", BaseParam.SOURCE)
                .get("http://121.40.239.205:8000/service/rest/v1/signflow/list");
        HashMap<String, String> file = responseForSign.jsonPath().get("data.signFlows[0]");
        String participantId = file.get("participantId");
        return participantId;
    }

    //签署文件流程明细详情
    public String getFlowDocId() {
        Response responseForParticipantId = given()
                .cookie("SESSION", sessionId)
                .param("participantId", participantId)
                .param("source", BaseParam.SOURCE)
                .get("http://121.40.239.205:8000/service/rest/v1/signflow/detail");
        String myFile = responseForParticipantId.asString();
        ArrayList<HashMap<String, String>> flow = responseForParticipantId.jsonPath().get("data.flowDocDataList");
        String flowDocId = flow.get(0).get("flowDocId");
        return flowDocId;

    }

}
