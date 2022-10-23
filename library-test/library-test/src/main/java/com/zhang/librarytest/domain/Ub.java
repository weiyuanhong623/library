package com.zhang.librarytest.domain;

public class Ub {

    private Integer id;
    private Integer uid;
    private Integer bid;
    private String lend_time;
    private String return_time;

    @Override
    public String toString() {
        return "Ub{" +
                "id=" + id +
                ", uid=" + uid +
                ", bid=" + bid +
                ", lend_time='" + lend_time + '\'' +
                ", return_time='" + return_time + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getLend_time() {
        return lend_time;
    }

    public void setLend_time(String lend_time) {
        this.lend_time = lend_time;
    }

    public String getReturn_time() {
        return return_time;
    }

    public void setReturn_time(String return_time) {
        this.return_time = return_time;
    }
}
