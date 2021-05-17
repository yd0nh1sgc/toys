package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class Users {//用户实体
    private Integer id;//用户实体ID
    private String account;//用户账号
    private String password;//用户密码
    private String username;//用户姓名
    private String sex;//用户性别
    private String phone;//用户联系电话
    private String nickname;//用户昵称
    private String birthday;//用户生日
    private String residenceAddress;//用户住址
    private String headImage;//用户头像
    private String headImageURL;//头像图片地址
    private String paymentPassword;//支付密码
    private String MD5;//加密


    public Users(Integer id, String account, String password, String username, String sex, String phone, String nickname, String birthday, String residenceAddress, String headImage, String headImageURL, String paymentPassword, String MD5) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.username = username;
        this.sex = sex;
        this.phone = phone;
        this.nickname = nickname;
        this.birthday = birthday;
        this.residenceAddress = residenceAddress;
        this.headImage = headImage;
        this.headImageURL = headImageURL;
        this.paymentPassword = paymentPassword;
        this.MD5 = MD5;
    }

    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getHeadImageURL() {
        return headImageURL;
    }

    public void setHeadImageURL(String headImageURL) {
        this.headImageURL = headImageURL;
    }

    public String getPaymentPassword() {
        return paymentPassword;
    }

    public void setPaymentPassword(String paymentPassword) {
        this.paymentPassword = paymentPassword;
    }

    public String getMD5() {
        return MD5;
    }

    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", phone=" + phone +
                ", nickname='" + nickname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", residenceAddress='" + residenceAddress + '\'' +
                ", headImage='" + headImage + '\'' +
                ", headImageURL='" + headImageURL + '\'' +
                ", paymentPassword='" + paymentPassword + '\'' +
                ", MD5='" + MD5 + '\'' +
                '}';
    }
}
