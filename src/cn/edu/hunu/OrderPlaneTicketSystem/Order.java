package cn.edu.hunu.OrderPlaneTicketSystem;

import java.util.List;
import java.util.Set;

public class Order {
    private String id;//订单ID，与业务无关
    private float customerType; //乘客单价，包括：成人、儿童、婴儿
    private float jcs; //机场税
    private float ryf; //燃油费
    private float hkzhx; //航空综合险
    private float jptgx; //机票退改险
    private float yhq; //优惠券
    private float hszj; //含税总价
    private Set<Customer> customerSet;

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCustomerType() {
        return customerType;
    }

    public void setCustomerType(float customerType) {
        this.customerType = customerType;
    }

    public float getJcs() {
        return jcs;
    }

    public void setJcs(float jcs) {
        this.jcs = jcs;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }
}
