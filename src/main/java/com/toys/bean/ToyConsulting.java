package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class ToyConsulting {
    private Integer id;//玩具咨询实体主键
    private String consultationType;//质询类型
    private String consultationText;//质询内容
    private String phoneOrEmail;//联系方式
    private Users userId;//用户ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsultationType() {
        return consultationType;
    }

    public void setConsultationType(String consultationType) {
        this.consultationType = consultationType;
    }

    public String getConsultationText() {
        return consultationText;
    }

    public void setConsultationText(String consultationText) {
        this.consultationText = consultationText;
    }

    public String getPhoneOrEmail() {
        return phoneOrEmail;
    }

    public void setPhoneOrEmail(String phoneOrEmail) {
        this.phoneOrEmail = phoneOrEmail;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public ToyConsulting() {
    }



    @Override
    public String toString() {
        return "ToyConsulting{" +
                "id=" + id +
                ", consultationType='" + consultationType + '\'' +
                ", consultationText='" + consultationText + '\'' +
                ", phoneOrEmail='" + phoneOrEmail + '\'' +
                ", userId=" + userId +
                '}';
    }
}
