
package tech.tech3br.orderms.listener.dto;

import java.math.BigDecimal;

public record OrderItemEvent(String produto, Integer quantidade, BigDecimal preco) {
    // Este record representa um item do pedido, contendo o código do produto e a quantidade.
    // Ele pode ser usado para transmitir informações sobre os itens de um pedido criado.
}