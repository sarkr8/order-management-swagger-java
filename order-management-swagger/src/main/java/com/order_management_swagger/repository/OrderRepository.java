package com.order_management_swagger.repository;

import com.order_management_swagger.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
  // Aquí ya tenemos gratis: save(), findAll(), findById(), deleteById()...
}