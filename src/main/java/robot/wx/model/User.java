package robot.wx.model;

import java.util.Date;

public class User {
    private String userHead;
    private String userName;
    private int userGender;
    private String country;
    private String province;
    private String city;
    private String language;
    private Date userNewLogin;
    private String openId;

    public User(){

    }

    public User(String userHead, String userName, int userGender, String country, String province, String city, String language, Date userNewLogin, String openId) {
        this.userHead = userHead;
        this.userName = userName;
        this.userGender = userGender;
        this.country = country;
        this.province = province;
        this.city = city;
        this.language = language;
        this.userNewLogin = userNewLogin;
        this.openId = openId;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserGender() {
        return userGender;
    }

    public void setUserGender(int userGender) {
        this.userGender = userGender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getUserNewLogin() {
        return userNewLogin;
    }

    public void setUserNewLogin(Date userNewLogin) {
        this.userNewLogin = userNewLogin;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
