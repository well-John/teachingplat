package com.dgut.entity;

import lombok.ToString;

import java.util.Date;

@ToString
public class Feedback {
    private Integer id;

    private String content;

    private Integer organsier;

    private Date addDate;

    private Integer organsierId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getOrgansier() {
        return organsier;
    }

    public void setOrgansier(Integer organsier) {
        this.organsier = organsier;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getOrgansierId() {
        return organsierId;
    }

    public void setOrgansierId(Integer organsierId) {
        this.organsierId = organsierId;
    }
}