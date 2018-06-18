package com.zhaobf.springbootmybatis.service.process;

import com.alibaba.fastjson.JSON;
import com.zhaobf.springbootmybatis.service.param.baseParam.BaseParam;
import com.zhaobf.springbootmybatis.service.returnValue.file.ResponseForDoc;
import io.restassured.response.Response;
import org.junit.Test;

;import java.io.File;

import static io.restassured.RestAssured.given;

/**
 * 发起签署
 *
 * @author wujiaojiao
 * @create 2018-05-20 下午3:23
 **/
public class LaunchToSign {
    String sessionId = null;

    @Test
    public void launchSign() {
        sessionId = EsignLogin.login("18667021101", "111111q");
        upLoadFile();
        Signing.buildSignParam()
    }

    public ResponseForDoc upLoadFile() {
        Response responseForUpLoadFile = given()
                .cookie("SESSION", sessionId)
                .contentType("multipart/form-data")
                .multiPart("fileList", new File("/Users/wujiaojiao/downloads/ISTQB FL大纲.pdf"))
                .formParam("flowId")
                .formParam("flowType", 2)
                .formParam("docName", "ISTQB FL大纲.pdf")
                .formParam("source", BaseParam.SOURCE)
                .post("http://121.40.239.205:8000/service/rest/v1/file/upload/multipart");
        String file = responseForUpLoadFile.asString();
        ResponseForDoc responseForDoc = JSON.parseObject(file, ResponseForDoc.class);
        return responseForDoc;
    }

    public void update() {
        ResponseForDoc responseForDoc=upLoadFile();
        Response responseForUpdate = given()
                .cookie("SESSION",sessionId)
                .request().body()
    }

}
