package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class ToyClassification {
    private Integer id;//玩具分类ID
    private String classifyName;//分类名

    public ToyClassification() {
    }

    public ToyClassification(int id, String classifyName) {
        this.id = id;
        this.classifyName = classifyName;
    }

    @Override
    public String toString() {
        return "ToyClassification{" +
                "id=" + id +
                ", classifyName='" + classifyName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }
}
