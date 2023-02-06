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
public class alumno extends Persona{

    static void remove(int indiceAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static int size(int indiceAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     private int idEstudiante;
  private Clase[] clases;

  public alumno(String nombre, int id, Date fechaNacimiento, int idEstudiante, Clase[] clases) {
    super(nombre, id, fechaNacimiento);
    this.idEstudiante = idEstudiante;
    this.clases = clases;
  }

  public int getIdEstudiante() {
    return idEstudiante;
  }

  public Clase[] getClases() {
    return clases;
  }
}

