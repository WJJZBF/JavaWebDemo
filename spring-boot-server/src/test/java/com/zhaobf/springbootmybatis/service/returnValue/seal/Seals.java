package com.zhaobf.springbootmybatis.service.returnValue.seal;

import java.util.Date;

;

/**
 * @author wujiaojiao
 * @create 2018-05-20 下午2:10
 **/
public class Seals {
    private String name;
    private String sealId;
    private String sealOsskey;
    private String sealUrl;
    private Integer sealType;
    private Integer templateType;
    private Integer status;
    private String rejReason;
    private Integer width;
    private Integer height;
    private String creatorUid;
    private String creatorName;
    private Date createTime;
    private Boolean isDefault;
    private Boolean isGranted;
    private Boolean hasCert;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSealId() {
        return sealId;
    }

    public void setSealId(String sealId) {
        this.sealId = sealId;
    }

    public String getSealOsskey() {
        return sealOsskey;
    }

    public void setSealOsskey(String sealOsskey) {
        this.sealOsskey = sealOsskey;
    }

    public String getSealUrl() {
        return sealUrl;
    }

    public void setSealUrl(String sealUrl) {
        this.sealUrl = sealUrl;
    }

    public Integer getSealType() {
        return sealType;
    }

    public void setSealType(Integer sealType) {
        this.sealType = sealType;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRejReason() {
        return rejReason;
    }

    public void setRejReason(String rejReason) {
        this.rejReason = rejReason;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getCreatorUid() {
        return creatorUid;
    }

    public void setCreatorUid(String creatorUid) {
        this.creatorUid = creatorUid;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getGranted() {
        return isGranted;
    }

    public void setGranted(Boolean granted) {
        isGranted = granted;
    }

    public Boolean getHasCert() {
        return hasCert;
    }

    public void setHasCert(Boolean hasCert) {
        this.hasCert = hasCert;
    }
}
