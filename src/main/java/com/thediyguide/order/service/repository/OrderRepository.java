package com.thediyguide.order.service.repository;

import com.thediyguide.order.service.model.Order;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
@EnableScan
public interface OrderRepository extends CrudRepository<Order, String> {
}
