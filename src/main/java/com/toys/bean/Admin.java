package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class Admin {//管理员实体
    private Integer id;//主键
    private  String account;//账号
    private  String password;//密码
    private  String name;//管理员姓名
    private  String sex;//性别
    private  String phone;//联系电话
    private  String md5;//加密

    public Admin() {
    }

    public Admin(Integer id, String account, String password, String name, String sex, String phone, String md5) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.md5 = md5;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone=" + phone +
                ", md5='" + md5 + '\'' +
                '}';
    }
}
