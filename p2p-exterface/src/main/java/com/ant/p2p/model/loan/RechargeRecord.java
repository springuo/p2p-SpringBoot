package com.ant.p2p.model.loan;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:RechargeRecord
 * Package:com.ant.p2p.model.loan
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 * @Email 41700175@qq.com
 */
public class RechargeRecord implements Serializable{
    private Integer id;

    private Integer uid;

    private String rechargeno;

    private String rechargestatus;

    private Double rechargemoney;

    private Date rechargetime;

    private String rechargedesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRechargeno() {
        return rechargeno;
    }

    public void setRechargeno(String rechargeno) {
        this.rechargeno = rechargeno;
    }

    public String getRechargestatus() {
        return rechargestatus;
    }

    public void setRechargestatus(String rechargestatus) {
        this.rechargestatus = rechargestatus;
    }

    public Double getRechargemoney() {
        return rechargemoney;
    }

    public void setRechargemoney(Double rechargemoney) {
        this.rechargemoney = rechargemoney;
    }

    public Date getRechargetime() {
        return rechargetime;
    }

    public void setRechargetime(Date rechargetime) {
        this.rechargetime = rechargetime;
    }

    public String getRechargedesc() {
        return rechargedesc;
    }

    public void setRechargedesc(String rechargedesc) {
        this.rechargedesc = rechargedesc;
    }
}