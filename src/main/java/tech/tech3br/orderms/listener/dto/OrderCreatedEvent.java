package tech.tech3br.orderms.listener.dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido, Long codigoCliente, List<OrderItemEvent> itens) {
    public static final String ORDER_CREATED_QUEUE = "orderms-order-created";
    

}
