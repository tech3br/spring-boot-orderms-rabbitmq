package tech.tech3br.orderms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tech.tech3br.orderms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    // This class can be extended with custom query methods if needed
    // For example, you could add methods to find orders by customer ID or status

}
