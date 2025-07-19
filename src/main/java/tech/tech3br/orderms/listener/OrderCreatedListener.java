package tech.tech3br.orderms.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import tech.tech3br.orderms.listener.dto.OrderCreatedEvent;
import static tech.tech3br.orderms.listener.dto.OrderCreatedEvent.ORDER_CREATED_QUEUE;
import tech.tech3br.orderms.service.OrderService;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    public final OrderService orderService;

    public OrderCreatedListener(OrderService orderService) {
        this.orderService = orderService;
    }

    // Este método será chamado quando uma mensagem for recebida na fila de pedidos criados.
    // A anotação @Component indica que esta classe é um componente Spring, permitindo que o
    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){
        logger.info("Message consumed: {}", message);

        orderService.save(message.getPayload());
    }
}
