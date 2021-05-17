package com.toys.bean;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class IntroductionOfToys {
    private Integer id;//玩具介绍
    private Date shelfTime;//上架时间
    private double weight;//商品毛重
    private String productSpecifications;//产品规格
    private String packagingSpecification;//包装规格

    public IntroductionOfToys() {
    }
    @Override
    public String toString() {
        return "IntroductionOfToys{" +
                "id=" + id +
                ", shelfTime=" + shelfTime +
                ", weight=" + weight +
                ", productSpecifications='" + productSpecifications + '\'' +
                ", packagingSpecification='" + packagingSpecification + '\'' +
                '}';
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Date shelfTime) {
        this.shelfTime = shelfTime;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProductSpecifications() {
        return productSpecifications;
    }

    public void setProductSpecifications(String productSpecifications) {
        this.productSpecifications = productSpecifications;
    }

    public String getPackagingSpecification() {
        return packagingSpecification;
    }

    public void setPackagingSpecification(String packagingSpecification) {
        this.packagingSpecification = packagingSpecification;
    }
}
