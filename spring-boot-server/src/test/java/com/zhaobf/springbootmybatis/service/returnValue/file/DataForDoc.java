package com.zhaobf.springbootmybatis.service.returnValue.file;

import java.util.List;

;

/**
 * @author wujiaojiao
 * @create 2018-05-20 下午6:31
 **/
public class DataForDoc {
    private String participantId;
    private String flowId;
    private String docName;
    private List<Doc> docDataList;
    private String md5List;
    private String accountUid;

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public List<Doc> getDocDataList() {
        return docDataList;
    }

    public void setDocDataList(List<Doc> docDataList) {
        this.docDataList = docDataList;
    }

    public String getMd5List() {
        return md5List;
    }

    public void setMd5List(String md5List) {
        this.md5List = md5List;
    }

    public String getAccountUid() {
        return accountUid;
    }

    public void setAccountUid(String accountUid) {
        this.accountUid = accountUid;
    }
}
