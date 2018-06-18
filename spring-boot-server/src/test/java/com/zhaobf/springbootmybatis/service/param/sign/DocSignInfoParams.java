package com.zhaobf.springbootmybatis.service.param.sign;

import java.util.List;

;

/**
 * @author wujiaojiao
 * @create 2018-05-19 下午10:02
 **/
public class DocSignInfoParams {
    private String flowDocId;
    private List<PosArrayParams> posArray;

    public String getFlowDocId() {
        return flowDocId;
    }

    public void setFlowDocId(String flowDocId) {
        this.flowDocId = flowDocId;
    }

    public List<PosArrayParams> getPosArray() {
        return posArray;
    }

    public void setPosArray(List<PosArrayParams> posArray) {
        this.posArray = posArray;
    }
}
