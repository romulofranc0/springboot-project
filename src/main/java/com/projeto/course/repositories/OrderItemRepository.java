package com.projeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.course.entities.OrderItem;
import com.projeto.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
