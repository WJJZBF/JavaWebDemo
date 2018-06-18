package com.zhaobf.springbootmybatis.service.param.login;

import com.zhaobf.springbootmybatis.service.param.baseParam.BaseParam;

;

/**
 * @author wujiaojiao
 * @create 2018-05-19 下午4:01
 **/
public class LoginParams extends BaseParam {
    private String account;
    private String pwd;
    private int type;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
