package com.order_management_swagger.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data // Genera getters, setters, toString, etc.
@NoArgsConstructor // Constructor vacío
@AllArgsConstructor // Constructor con todos los campos
@Entity // Define que esta clase es una tabla en la base de datos
@Table(name = "orders")
@Schema(description = "Modelo que representa un pedido de la tienda")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Schema(description = "ID único del pedido", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
  private Long id;

  @NotBlank(message = "El nombre del cliente no puede estar vacío")
  @Schema(description = "Nombre del cliente", example = "Daniela Barazarte")
  private String customerName;

  @NotBlank(message = "El artículo no puede estar vacío")
  @Schema(description = "Artículo comprado", example = "T-Shirt")
  private String clothingItem;

  @Min(value = 1, message = "La cantidad debe ser al menos 1")
  @Schema(description = "Cantidad de artículos", example = "12")
  private Integer quantity;

  @Positive(message = "El precio debe ser mayor a 0")
  @Schema(description = "Precio total", example = "50.0")
  private Double price;

  @Schema(description = "Fecha de la compra", accessMode = Schema.AccessMode.READ_ONLY)
  private LocalDateTime purchaseDate;

  // Método para asignar la fecha automáticamente antes de guardar
  @PrePersist
  protected void onCreate() {
    this.purchaseDate = LocalDateTime.now();
  }
}