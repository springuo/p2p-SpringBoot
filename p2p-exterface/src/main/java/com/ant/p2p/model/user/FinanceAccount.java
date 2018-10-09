package com.ant.p2p.model.user;

import java.io.Serializable;

/**
 * ClassName:FinanceAccount
 * Package:com.ant.p2p.model.user
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 * @Email 41700175@qq.com
 */
public class FinanceAccount implements Serializable{
    private Integer id;

    private Integer uid;

    private Double availableMoney;

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

    public Double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(Double availableMoney) {
        this.availableMoney = availableMoney;
    }
}