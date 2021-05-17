package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by 王易山 on 2018/1/25.
 * 购物车类
 */
@Component
public class ShoppingCart {
    private Integer id;//购物车ID
    private Users userId;//用户ID
    private Toys toyId;//玩具ID

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", userId=" + userId +
                ", toyId=" + toyId +
                '}';
    }

    public ShoppingCart(Integer id, Users userId, Toys toyId) {
        this.id = id;
        this.userId = userId;
        this.toyId = toyId;
    }

    public ShoppingCart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Toys getToyId() {
        return toyId;
    }

    public void setToyId(Toys toyId) {
        this.toyId = toyId;
    }
}
