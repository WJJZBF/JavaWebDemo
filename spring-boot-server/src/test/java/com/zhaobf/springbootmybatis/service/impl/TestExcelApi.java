package com.zhaobf.springbootmybatis.service.impl;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

;import java.util.HashMap;

/**
 * @author wujiaojiao
 * @create 2018-05-10 下午3:00
 **/
public class TestExcelApi {
    @DataProvider(name = "testData")
    public Object[][] data() {
        TestCaseExcel testcase = new TestCaseExcel();
        return testcase.testData("file");
    }

    @Test(dataProvider = "testData")
    public void testCase(HashMap<String, String> data) {
        String id = data.get("ID");
        String testcase = data.get("TestCase");
        String requestType=data.get("RequestType");
        String host=data.get("host");
        String requestStuff=data.get("RequestStuff");

    }

}
