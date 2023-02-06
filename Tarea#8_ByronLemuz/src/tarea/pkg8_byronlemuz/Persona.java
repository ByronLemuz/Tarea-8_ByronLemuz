/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg8_byronlemuz;
 import java.util.Date;
/**
 *
 * @author lesly
 */
public class Persona{
  private String nombre;
  private int id;
  private Date fechaNacimiento;

  public Persona(String nombre, int id, Date fechaNacimiento) {
    this.nombre = nombre;
    this.id = id;
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getNombre() {
    return nombre;
  }

  public int getId() {
    return id;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }
}


