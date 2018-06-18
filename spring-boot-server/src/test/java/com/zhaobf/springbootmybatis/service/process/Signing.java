package com.zhaobf.springbootmybatis.service.process;

import com.alibaba.fastjson.JSON;
import com.zhaobf.springbootmybatis.service.param.sign.DocSignInfoParams;
import com.zhaobf.springbootmybatis.service.param.sign.PosArrayParams;
import com.zhaobf.springbootmybatis.service.param.sign.SignParams;
import com.zhaobf.springbootmybatis.service.returnValue.seal.Seals;

import java.util.ArrayList;
import java.util.List;

;

/**
 * 签署
 * @author wujiaojiao
 * @create 2018-05-20 下午6:53
 **/
public class Signing {
    public static String buildSignParam(String participantId, String flowDocId, List<Seals> seals) {
        SignParams signParams = new SignParams();
        //对signparams设值
        signParams.setParticipantId(participantId);
        signParams.setCode("b94782430384939d60b1255a4bef734d");
        signParams.setIsAutoComplete(1);
        signParams.setValidateType(1);
        signParams.setSource("esign");
        //创建列表，并且创建DocSignInfoParams的实例，把对象添加到列表里面
        List<DocSignInfoParams> docSignInfoParams = new ArrayList<>();
        DocSignInfoParams docSignInfoParam = new DocSignInfoParams();
        docSignInfoParams.add(docSignInfoParam);
        docSignInfoParam.setFlowDocId(flowDocId);
        //创建列表，并且创建PosArrayParams的实例，把对象添加到列表里面
        List<PosArrayParams> posArrayParams = new ArrayList<>();
        PosArrayParams posArrayParam = new PosArrayParams();
        posArrayParam.setPosX(386.923f);
        posArrayParam.setPosY(793.538f);
        posArrayParam.setPosPage(1);
        //获取第一个印章
        String sealId0= seals.get(0).getSealId();
        posArrayParam.setSealId(sealId0);

        posArrayParam.setSignType(1);
        posArrayParams.add(posArrayParam);
        PosArrayParams posArrayParam1=new PosArrayParams();
        posArrayParam1.setPosX(334.000f);
        posArrayParam1.setPosY(793.538f);
        posArrayParam1.setPosPage(1);
        //获取第二个印章
        String sealId1= seals.get(0).getSealId();
        posArrayParam1.setSealId(sealId1);

        posArrayParam1.setSignType(1);
        posArrayParams.add(posArrayParam1);
        docSignInfoParam.setPosArray(posArrayParams);

        signParams.setDocSignInfoList(docSignInfoParams);
        //把对象解析为字符串
        String stringBody = JSON.toJSONString(signParams);
        return stringBody;
    }
    public static String buildDocForSign(String flowId,String docName){

    }
}
