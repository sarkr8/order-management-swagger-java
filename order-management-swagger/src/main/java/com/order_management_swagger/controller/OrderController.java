package com.order_management_swagger.controller;

import com.order_management_swagger.model.Order;
import com.order_management_swagger.repository.OrderRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@Tag(name = "Pedidos", description = "Endpoints para la gestión de pedidos de la tienda de ropa")
public class OrderController {

  @Autowired
  private OrderRepository repository;

  @GetMapping
  @Operation(summary = "Obtener todos los pedidos", description = "Retorna una lista de todos los pedidos almacenados en la base de datos H2")
  public List<Order> getAllOrders() {
    return repository.findAll();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Obtener un pedido por ID", description = "Busca un pedido específico usando su identificador único")
  public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
    return repository.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  @Operation(summary = "Crear un pedido", description = "Registra un nuevo pedido. La fecha se genera automáticamente.")
  public Order createOrder(@Valid @RequestBody Order order) {
    return repository.save(order);
  }

  @PutMapping("/{id}")
  @Operation(summary = "Actualizar un pedido", description = "Modifica los datos de un pedido existente. Si el ID no existe, retorna 404.")
  public ResponseEntity<Order> updateOrder(@PathVariable Long id, @Valid @RequestBody Order orderDetails) {
    return repository.findById(id)
        .map(order -> {
          order.setCustomerName(orderDetails.getCustomerName());
          order.setClothingItem(orderDetails.getClothingItem());
          order.setQuantity(orderDetails.getQuantity());
          order.setPrice(orderDetails.getPrice());
          return ResponseEntity.ok(repository.save(order));
        })
        .orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Eliminar un pedido", description = "Borra permanentemente un pedido del sistema mediante su ID")
  public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
    if (repository.existsById(id)) {
      repository.deleteById(id);
      return ResponseEntity.noContent().build();
    }
    return ResponseEntity.notFound().build();
  }
}