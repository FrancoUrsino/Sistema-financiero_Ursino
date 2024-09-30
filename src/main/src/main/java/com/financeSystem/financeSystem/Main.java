package com.financeSystem.financeSystem;

public class Main {
  public static void main(String[] args) {
    // Crear un cliente
    Cliente cliente = new Cliente("Franco", "franco@franco.com", "1234");
    System.out.println(cliente.toString());

    // Crear un producto
    Producto producto = new Producto("mueble", 100);
    System.out.println(producto.toString());

    // Crear una venta
    Venta venta = new Venta("mueble", 1, 100);
    System.out.println(venta.toString());
  }
}