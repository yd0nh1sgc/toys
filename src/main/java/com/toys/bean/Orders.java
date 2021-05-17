package com.toys.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class Orders {
    private Integer id;//订单ID
    private String orderNumber;//订单编号
    private Users userID;//用户ID
    private Toys toyID;//商品ID
    private Date ordertime;//订单时间
    private String orderStatus;//订单状态
    private Integer toyNumber;//商品数量
    private double countMoney;//交易总额

    public Orders() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Users getUserID() {
        return userID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }

    public Toys getToyID() {
        return toyID;
    }

    public void setToyID(Toys toyID) {
        this.toyID = toyID;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getToyNumber() {
        return toyNumber;
    }

    public void setToyNumber(Integer toyNumber) {
        this.toyNumber = toyNumber;
    }

    public double getCountMoney() {
        return countMoney;
    }

    public void setCountMoney(double countMoney) {
        this.countMoney = countMoney;
    }

    public Orders(Integer id, String orderNumber, Users userID, Toys toyID, Date ordertime, String orderStatus, Integer toyNumber, double countMoney) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.userID = userID;
        this.toyID = toyID;
        this.ordertime = ordertime;
        this.orderStatus = orderStatus;
        this.toyNumber = toyNumber;
        this.countMoney = countMoney;
    }
}
