package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class Toys {//玩具表实体
    private Integer toyId;//玩具主键
    private String toyName;//玩具名称
    private String introduce;//简介
    private double price;//价格
    private String brandId;//品牌
    private ToyClassificationInfo toyClassificationInfoId;//分类ID
    private String toyStatus;//玩具状态


    public Toys(Integer toyId, String toyName, String introduce, double price, String brandId, ToyClassificationInfo toyClassificationInfoId, String toyStatus) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.introduce = introduce;
        this.price = price;
        this.brandId = brandId;
        this.toyClassificationInfoId = toyClassificationInfoId;
        this.toyStatus = toyStatus;
    }

    public Toys() {
    }

    public Integer getToyId() {
        return toyId;
    }

    public void setToyId(Integer toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public ToyClassificationInfo getToyClassificationInfoId() {
        return toyClassificationInfoId;
    }

    public void setToyClassificationInfoId(ToyClassificationInfo toyClassificationInfoId) {
        this.toyClassificationInfoId = toyClassificationInfoId;
    }

    public String getToyStatus() {
        return toyStatus;
    }

    public void setToyStatus(String toyStatus) {
        this.toyStatus =   toyStatus;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "toyId=" + toyId +
                ", toyName='" + toyName + '\'' +
                ", introduce='" + introduce + '\'' +
                ", price=" + price +
                ", brandId='" + brandId + '\'' +
                ", toyClassificationInfoId=" + toyClassificationInfoId +
                ", toyStatus='" + toyStatus + '\'' +
                '}';
    }
}
