package com.soft1851.spring.entity;

/**
 * @author ke
 * @ClassName Phone
 * @Description TOOD
 * @Date 2020/3/17
 * @Version 1.0
 **/
public class Phone {
    private String brand;
    private Integer price;

    public Phone(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }
    public Phone() {

    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
