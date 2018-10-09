package com.ant.p2p.model.loan;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:IncomeRecord
 * Package:com.ant.p2p.model.loan
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 * @Email 41700175@qq.com
 */
public class IncomeRecord implements Serializable{
    private Integer id;

    private Integer uid;

    private Integer loanid;

    private Integer bidid;

    private Double bidmoney;

    private Date incomedate;

    private Double incomemoney;

    private Integer incomestatus;

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

    public Integer getLoanid() {
        return loanid;
    }

    public void setLoanid(Integer loanid) {
        this.loanid = loanid;
    }

    public Integer getBidid() {
        return bidid;
    }

    public void setBidid(Integer bidid) {
        this.bidid = bidid;
    }

    public Double getBidmoney() {
        return bidmoney;
    }

    public void setBidmoney(Double bidmoney) {
        this.bidmoney = bidmoney;
    }

    public Date getIncomedate() {
        return incomedate;
    }

    public void setIncomedate(Date incomedate) {
        this.incomedate = incomedate;
    }

    public Double getIncomemoney() {
        return incomemoney;
    }

    public void setIncomemoney(Double incomemoney) {
        this.incomemoney = incomemoney;
    }

    public Integer getIncomestatus() {
        return incomestatus;
    }

    public void setIncomestatus(Integer incomestatus) {
        this.incomestatus = incomestatus;
    }
}