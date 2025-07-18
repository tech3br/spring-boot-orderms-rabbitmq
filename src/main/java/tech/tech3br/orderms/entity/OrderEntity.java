package tech.tech3br.orderms.entity;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "tb_orders")
public class OrderEntity {
    // Usando camelCase para os atributos apenas por convenção e para manter a consistência com o padrão de nomenclatura do Java.
    // O nome da coleção no MongoDB será "tb_orders" conforme especificado na anotação @Document.
    // O MongoDB não se importa com o caso dos nomes dos campos, então isso não
    // afetará a funcionalidade do banco de dados.
    // A anotação @MongoId é usada para indicar que este campo é o identificador
    // único do documento no MongoDB, substituindo a anotação @Id do Spring Data
    // JPA, que é mais comum em bancos de dados relacionais.
    // A anotação @Document é usada para mapear a classe para uma coleção no MongoDB,
    // e o nome da coleção é especificado como "tb_orders".

    @MongoId
    private Long orderId;

    @Indexed(name = "customer_id_index")
    private Long customerId;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal total;

    private List<OrderItem> items;

    public OrderEntity() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

}
