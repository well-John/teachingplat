package com.dgut.entity;

import java.util.Date;

public class Deposit {
    private Integer id;

    private Date chargeDate;

    private String chargeMoney;

    private Integer status;

    private Integer organiser;

    private Integer organiserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(Date chargeDate) {
        this.chargeDate = chargeDate;
    }

    public String getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(String chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrganiser() {
        return organiser;
    }

    public void setOrganiser(Integer organiser) {
        this.organiser = organiser;
    }

    public Integer getOrganiserId() {
        return organiserId;
    }

    public void setOrganiserId(Integer organiserId) {
        this.organiserId = organiserId;
    }
}