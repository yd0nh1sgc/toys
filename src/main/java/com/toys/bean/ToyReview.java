package com.toys.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class ToyReview {//评论实体
    private Integer id;//评论ID
    private Users userId;//用户ID
    private Toys toyId;//商品ID
    private String comment;//评论内容
    private Date commentDate;//评论时间

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
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Date getCommentDate() {
        return commentDate;
    }
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
    public ToyReview() {
    }
    @Override
    public String toString() {
        return "ToyReview{" +
                "id=" + id +
                ", userId=" + userId +
                ", toyId=" + toyId +
                ", comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }
}
