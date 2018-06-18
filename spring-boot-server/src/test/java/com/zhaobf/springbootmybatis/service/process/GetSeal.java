package com.zhaobf.springbootmybatis.service.process;

import com.alibaba.fastjson.JSON;
import com.zhaobf.springbootmybatis.service.param.baseParam.BaseParam;
import com.zhaobf.springbootmybatis.service.returnValue.seal.ResponseForSeals;
import com.zhaobf.springbootmybatis.service.returnValue.seal.Seals;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

;

/**
 * @author wujiaojiao
 * @create 2018-05-20 下午6:44
 **/
public class GetSeal {

    //获取印章列表
    public static List<Seals> getSealForSign(String sessionId) {
        Response responseForSealList = given()
                .cookie("SESSION", sessionId)
                .param("page", 1)
                .param("pageSize", 30)
                .param("status", 1)
                .param("source", BaseParam.SOURCE)
                .get("http://121.40.239.205:8000/service/rest/v1/seal/list");
        String mySeals = responseForSealList.asString();
        ResponseForSeals responseForSeals = JSON.parseObject(mySeals, ResponseForSeals.class);
        List<Seals> seals=responseForSeals.getData().getSeals();
        return seals;


    }
}
