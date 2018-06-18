package com.zhaobf.springbootmybatis.service.returnValue.seal;

;

/**
 * @author wujiaojiao
 * @create 2018-05-20 下午2:34
 **/
public class ResponseForSeals {
    private String success;
    private String msg;
    private Integer total;
    private Integer errCode;
    private Boolean errShow;
    private DataForSeals data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public Boolean getErrShow() {
        return errShow;
    }

    public void setErrShow(Boolean errShow) {
        this.errShow = errShow;
    }

    public DataForSeals getData() {
        return data;
    }

    public void setData(DataForSeals data) {
        this.data = data;
    }
}
