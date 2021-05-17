package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class UserCollection {//用户收藏实体
    private Integer id;//主键
    private Users userId;//用户ID
    private Toys toyID;//商品ID

    public UserCollection() {
    }

    public UserCollection(Integer id, Users userId, Toys toyID) {
        this.id = id;
        this.userId = userId;
        this.toyID = toyID;
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

    public Toys getToyID() {
        return toyID;
    }

    public void setToyID(Toys toyID) {
        this.toyID = toyID;
    }

    @Override
    public String toString() {
        return "UserCollection{" +
                "id=" + id +
                ", userId=" + userId +
                ", toyID=" + toyID +
                '}';
    }
}
