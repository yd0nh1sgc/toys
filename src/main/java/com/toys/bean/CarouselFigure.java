package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class CarouselFigure {
    private int id;//图片ID
    private String imageName;//图片名称
    private String URL;//图片路径

    public CarouselFigure() {
    }

    public CarouselFigure(int id, String imageName, String URL) {
        this.id = id;
        this.imageName = imageName;
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "CarouselFigure{" +
                "id=" + id +
                ", imageName='" + imageName + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
