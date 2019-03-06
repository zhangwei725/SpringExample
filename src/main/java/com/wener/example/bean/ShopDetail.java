package com.wener.example.bean;

/**
 * @author zhangwei
 */
public class ShopDetail {
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ShopDetail{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
