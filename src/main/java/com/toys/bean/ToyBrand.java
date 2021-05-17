package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class ToyBrand {
    private int id;//玩具品牌ID
    private String brandName;//品牌名字
    private String brandLogo;//品牌logo
    private String brandLogoURL;//logo地址
    private String address;//所在地

    public ToyBrand() {
    }

    public ToyBrand(int id, String brandName, String brandLogo, String brandLogoURL, String address) {
        this.id = id;
        this.brandName = brandName;
        this.brandLogo = brandLogo;
        this.brandLogoURL = brandLogoURL;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ToyBrand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", brandLogo='" + brandLogo + '\'' +
                ", brandLogoURL='" + brandLogoURL + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getBrandLogoURL() {
        return brandLogoURL;
    }

    public void setBrandLogoURL(String brandLogoURL) {
        this.brandLogoURL = brandLogoURL;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
