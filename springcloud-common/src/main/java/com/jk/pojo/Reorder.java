package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

public class Reorder implements Serializable {

    private static final long serialVersionUID = -714103871494210207L;

    private Integer orderId;
    private String orderNum;
    private String person;
    private String telNumber;
    private Integer reTime;
    private Integer status;
    private String commitDate;
    private String address;
    private List<ReGoods> regoods;

    private String startDate;
    private String endDate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public Integer getReTime() {
        return reTime;
    }

    public void setReTime(Integer reTime) {
        this.reTime = reTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(String commitDate) {
        this.commitDate = commitDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ReGoods> getRegoods() {
        return regoods;
    }

    public void setRegoods(List<ReGoods> regoods) {
        this.regoods = regoods;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
