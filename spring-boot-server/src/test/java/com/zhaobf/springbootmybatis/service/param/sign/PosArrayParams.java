package com.zhaobf.springbootmybatis.service.param.sign;

;

/**
 * @author wujiaojiao
 * @create 2018-05-19 下午10:02
 **/
public class PosArrayParams {
    private Float posX;
    private Float posY;
    private String sealId;
    private Integer posPage;
    private Integer signType;

    public Float getPosX() {
        return posX;
    }

    public void setPosX(Float posX) {
        this.posX = posX;
    }

    public Float getPosY() {
        return posY;
    }

    public void setPosY(Float posY) {
        this.posY = posY;
    }

    public String getSealId() {
        return sealId;
    }

    public void setSealId(String sealId) {
        this.sealId = sealId;
    }

    public Integer getPosPage() {
        return posPage;
    }

    public void setPosPage(Integer posPage) {
        this.posPage = posPage;
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }



}
