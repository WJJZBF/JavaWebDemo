package com.zhaobf.springbootmybatis.service.returnValue.file;

import java.util.Date;

;

/**
 * @author wujiaojiao
 * @create 2018-05-20 下午6:25
 **/
public class Doc {
    private String flowDocId;
    private String userFileld;
    private String flowDocName;
    private String posList;
    private String ossKey;
    private String url;
    private String reviewUrl;
    private String filetype;
    private Integer page;
    private Date createDate;

    public String getFlowDocId() {
        return flowDocId;
    }

    public void setFlowDocId(String flowDocId) {
        this.flowDocId = flowDocId;
    }

    public String getUserFileld() {
        return userFileld;
    }

    public void setUserFileld(String userFileld) {
        this.userFileld = userFileld;
    }

    public String getFlowDocName() {
        return flowDocName;
    }

    public void setFlowDocName(String flowDocName) {
        this.flowDocName = flowDocName;
    }

    public String getPosList() {
        return posList;
    }

    public void setPosList(String posList) {
        this.posList = posList;
    }

    public String getOssKey() {
        return ossKey;
    }

    public void setOssKey(String ossKey) {
        this.ossKey = ossKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReviewUrl() {
        return reviewUrl;
    }

    public void setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
    }

    public String getFileType() {
        return filetype;
    }

    public void setFileType(String fileType) {
        this.filetype = fileType;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
