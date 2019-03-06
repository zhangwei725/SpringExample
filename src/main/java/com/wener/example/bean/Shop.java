package com.wener.example.bean;

/**
 *
 * @author zhangwei
 *
 */
public class Shop {
    private int shopId;
    private String title;
    private String name;
    private ShopDetail detail;

    public Shop() {

    }

    public Shop(int shopId, String title) {
        this.shopId = shopId;
        this.title = title;
    }

    public Shop(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public Shop(int shopId, String title, String name) {
        this.shopId = shopId;
        this.title = title;
        this.name = name;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShopDetail getDetail() {
        return detail;
    }

    public void setDetail(ShopDetail detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "ShopDao{" +
                "shopId=" + shopId +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", detail=" + detail +
                '}';
    }
}
