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
public class Transportista extends Persona {
    private int aniosExperiencia;
  private String apodoBarrio;

  public Transportista(String nombre, int id, Date fechaNacimiento, int aniosExperiencia, String apodoBarrio) {
    super(nombre, id, fechaNacimiento);
    this.aniosExperiencia = aniosExperiencia;
    this.apodoBarrio = apodoBarrio;
  }

  public int getAniosExperiencia() {
    return aniosExperiencia;
  }

  public String getApodoBarrio() {
    return apodoBarrio;
  }

    void setTransporteActual(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


