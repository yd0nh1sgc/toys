package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class UserReceivingAddress {//收货地址实体
    private Integer id;//收货地址ID
    private Users usersId;//用户ID
    private String consigneeName;//收货人姓名
    private String phone;//手机号码
    private String fixedTelephone;//固定电话
    private String address;//收货地址


    public UserReceivingAddress(Integer id, Users usersId, String consigneeName, String phone, String fixedTelephone, String address) {
        this.id = id;
        this.usersId = usersId;
        this.consigneeName = consigneeName;
        this.phone = phone;
        this.fixedTelephone = fixedTelephone;
        this.address = address;
    }

    public UserReceivingAddress() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getPhone() {
        return phone;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFixedTelephone() {
        return fixedTelephone;
    }

    public void setFixedTelephone(String fixedTelephone) {
        this.fixedTelephone = fixedTelephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserReceivingAddress{" +
                "id=" + id +
                ", usersId=" + usersId +
                ", consigneeName='" + consigneeName + '\'' +
                ", phone='" + phone + '\'' +
                ", fixedTelephone='" + fixedTelephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
