package com.zhaobf.springbootmybatis.service.returnValue.seal;

import java.util.List;

;

/**
 * @author wujiaojiao
 * @create 2018-05-20 下午2:31
 **/
public class DataForSeals {
    private Integer total;
    private Integer page;
    private Integer pageSize;
    private List<Seals> seals;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<Seals> getSeals() {
        return seals;
    }

    public void setSeals(List<Seals> seals) {
        this.seals = seals;
    }
}
