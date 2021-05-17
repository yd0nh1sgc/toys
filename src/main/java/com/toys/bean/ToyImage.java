package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by 王易山 on 2018/1/25.
 * 玩具图片
 */
@Component
public class ToyImage {
    private Integer id;//玩具图片ID
    private Toys toyId;//玩具ID
    private String imageName;//图片名称
    private String imageURL;//图片路径

    @Override
    public String toString() {
        return "ToyImage{" +
                "id=" + id +
                ", toyId='" + toyId + '\'' +
                ", imageName='" + imageName + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    public ToyImage(Integer id, Toys toyId, String imageName, String imageURL) {
        this.id = id;
        this.toyId = toyId;
        this.imageName = imageName;
        this.imageURL = imageURL;
    }

    public ToyImage() {

    }

    public Integer getId() {
        return id;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
