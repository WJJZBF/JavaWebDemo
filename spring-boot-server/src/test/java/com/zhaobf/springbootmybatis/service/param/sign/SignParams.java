package com.zhaobf.springbootmybatis.service.param.sign;

import com.zhaobf.springbootmybatis.service.param.baseParam.BaseParam;

import java.util.List;

;

/**
 * @author wujiaojiao
 * @create 2018-05-19 下午10:01
 **/
public class SignParams extends BaseParam {
    private String participantId;
    private String code;
    private Integer isAutoComplete;
    private List<DocSignInfoParams> docSignInfoList;
    private Integer validateType;

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getIsAutoComplete() {
        return isAutoComplete;
    }

    public void setIsAutoComplete(Integer isAutoComplete) {
        this.isAutoComplete = isAutoComplete;
    }

    public List<DocSignInfoParams> getDocSignInfoList() {
        return docSignInfoList;
    }

    public void setDocSignInfoList(List<DocSignInfoParams> docSignInfoList) {
        this.docSignInfoList = docSignInfoList;
    }

    public Integer getValidateType() {
        return validateType;
    }

    public void setValidateType(Integer validateType) {
        this.validateType = validateType;
    }
}
