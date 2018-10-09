package com.ant.p2p.model.user;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:User
 * Package:com.ant.p2p.model.user
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 * @Email 41700175@qq.com
 */
public class User implements Serializable{
    private Integer id;

    private String phone;

    private String loginpassword;

    private String name;

    private String idcard;

    private Date addtime;

    private Date lastlogintime;

    private String headerimage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getHeaderimage() {
        return headerimage;
    }

    public void setHeaderimage(String headerimage) {
        this.headerimage = headerimage;
    }
}