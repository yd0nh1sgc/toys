package com.toys.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/25.
 */
@Component
public class ToyClassificationInfo {
    private Integer id;//玩具详细分类ID
    private String classifyInfo;//分类详情
    private ToyClassification classId;//玩具分类ID

    public ToyClassificationInfo() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ToyClassification getClassId() {
        return classId;
    }

    public void setClassId(ToyClassification classId) {
        this.classId = classId;
    }

    public String getClassifyInfo() {
        return classifyInfo;
    }

    public void setClassifyInfo(String classifyInfo) {
        this.classifyInfo = classifyInfo;
    }

    public ToyClassificationInfo(Integer id, String classifyInfo, ToyClassification classId) {
        this.id = id;
        this.classifyInfo = classifyInfo;
        this.classId = classId;
    }
}
