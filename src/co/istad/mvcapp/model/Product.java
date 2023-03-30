package co.istad.mvcapp.model;

import java.util.UUID;

public class Product {
    private UUID uuid;
    private String name;
    private Integer code;
    private Double priceIn;
    public Product(){}
    public Product(UUID uuid, String name, Integer code, Double priceIn) {
        this.uuid=uuid;
        this.name = name;
        this.code = code;
        this.priceIn = priceIn;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setId(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(Double price) {
        this.priceIn = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + uuid +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", price=" + priceIn +
                '}';
    }
}
