package com.financeSystem.financeSystem;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;
  private String email;
  private String telefono;

  public Cliente() {}

  public Cliente(String nombre, String email, String telefono) {
    this.nombre = nombre;
    this.email = email;
    this.telefono = telefono;
  }


  //============= G&S ==============
  public Long getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "Cliente{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", email='" + email + '\'' +
            ", telefono='" + telefono + '\'' +
            '}';
  }
}

