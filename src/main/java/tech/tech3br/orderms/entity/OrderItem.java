package tech.tech3br.orderms.entity;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

public class OrderItem {

    private String product;
    private Integer quantity;

    // Usando BigDecimal para representar valores monetários de forma precisa.
    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;

    public OrderItem(String product, Integer quantity, BigDecimal price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price.toString();
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
