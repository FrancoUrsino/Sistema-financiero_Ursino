package com.financeSystem.financeSystem;

import jakarta.persistence.*;

@Entity
@Table(name = "ventas")
public class Venta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String producto;
  private int cantidad;
  private double total;


  public Venta() {}

  public Venta(String producto, int cantidad, double total) {
    this.producto = producto;
    this.cantidad = cantidad;
    this.total = total;
  }

  public Long getId() {
    return id;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Venta{" +
            "id=" + id +
            ", producto='" + producto + '\'' +
            ", cantidad=" + cantidad +
            ", total=" + total +
            '}';
  }
}
