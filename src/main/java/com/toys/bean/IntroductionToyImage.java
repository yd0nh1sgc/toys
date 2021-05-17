package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by 王易山 on 2018/1/25.
 * 玩具介绍图片
 */
@Component
public class IntroductionToyImage {
    private Integer id;//玩具介绍图片ID
    private IntroductionOfToys introductionToyImage;//玩具介绍ID
    private  String imageName;//图片名称
    private  String imageURL;//图片地址

    @Override
    public String toString() {
        return "IntroductionToyImage{" +
                "id=" + id +
                ", introductionToyImage=" + introductionToyImage +
                ", imageName='" + imageName + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    public IntroductionToyImage(Integer id, IntroductionOfToys introductionToyImage, String imageName, String imageURL) {
        this.id = id;
        this.introductionToyImage = introductionToyImage;
        this.imageName = imageName;
        this.imageURL = imageURL;
    }

    public IntroductionToyImage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IntroductionOfToys getIntroductionToyImage() {
        return introductionToyImage;
    }

    public void setIntroductionToyImage(IntroductionOfToys introductionToyImage) {
        this.introductionToyImage = introductionToyImage;
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
