package tech.tech3br.orderms.config;

import org.springframework.amqp.core.Declarable;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREATED_QUEUE = "orderms-order-created";

    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
        // Este método cria um conversor de mensagens JSON para o RabbitMQ, permitindo que as mensagens sejam serializadas e desserializadas corretamente.
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Declarable orderCreatedQueue() {
        // Declara a fila para criação de pedidos. A fila será criada automaticamente se não existir.
        return new Queue(ORDER_CREATED_QUEUE, true);
    }

}
