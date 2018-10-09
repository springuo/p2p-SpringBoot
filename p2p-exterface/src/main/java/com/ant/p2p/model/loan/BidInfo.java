package com.ant.p2p.model.loan;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:BidInfo
 * Package:com.ant.p2p.model.loan
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 * @Email 41700175@qq.com
 */
public class BidInfo implements Serializable{
    private Integer id;

    private Integer loanid;

    private Integer uid;

    private Double bidmoney;

    private Date bidtime;

    private Integer bidstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoanid() {
        return loanid;
    }

    public void setLoanid(Integer loanid) {
        this.loanid = loanid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getBidmoney() {
        return bidmoney;
    }

    public void setBidmoney(Double bidmoney) {
        this.bidmoney = bidmoney;
    }

    public Date getBidtime() {
        return bidtime;
    }

    public void setBidtime(Date bidtime) {
        this.bidtime = bidtime;
    }

    public Integer getBidstatus() {
        return bidstatus;
    }

    public void setBidstatus(Integer bidstatus) {
        this.bidstatus = bidstatus;
    }
}