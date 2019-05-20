package com.qhit.utils;

import java.util.List;

public class Page {
    private String currpage = null;
    private String pageSize = null;
    private String total = null;
    private List rows = null;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public String getCurrpage() {
        return currpage;
    }

    public void setCurrpage(String currpage) {
        this.currpage = currpage;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

}