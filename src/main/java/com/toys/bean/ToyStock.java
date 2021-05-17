package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class ToyStock {
    private Integer id;//玩具库存ID
    private Toys toyId;//玩具ID
    private String toyColor;//玩具颜色
    private String toyStock;//库存数量

    public ToyStock() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Toys getToyId() {
        return toyId;
    }

    public void setToyId(Toys toyId) {
        this.toyId = toyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getToyColor() {
        return toyColor;
    }

    public void setToyColor(String toyColor) {
        this.toyColor = toyColor;
    }

    public String getToyStock() {
        return toyStock;
    }

    public void setToyStock(String toyStock) {
        this.toyStock = toyStock;
    }

    public ToyStock(Integer id, Toys toyId, String toyColor, String toyStock) {
        this.id = id;
        this.toyId = toyId;
        this.toyColor = toyColor;
        this.toyStock = toyStock;
    }
}
