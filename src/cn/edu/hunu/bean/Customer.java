package cn.edu.hunu.bean;

import javax.xml.crypto.Data;

public class Customer {
    private String id; //乘客ID，与业务无关
    private String name; //乘客姓名
    private String cardId; //身份证号
    private Data birthday; //出生日期
    private String phone; //电话号码

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Data getBirthday() {
        return birthday;
    }

    public void setBirthday(Data birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
