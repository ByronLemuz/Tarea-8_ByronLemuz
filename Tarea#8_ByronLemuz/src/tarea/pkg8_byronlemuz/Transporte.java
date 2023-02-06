/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg8_byronlemuz;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author lesly
 */
public class Transporte {

    private int personasDePie;
    private int sillas;
    private Transportista transportista;
    private Object estudiantes;
    
  // ... Atributos y métodos previos

  public void simular(ArrayList<alumno> estudiantes, Transportista transportista, ArrayList<Estacion> estaciones) {
    // Asignar transportista
    this.transportista = transportista;

    // Asignar estudiantes
    int capacidadMaxima = 0;
    String Bus;
    
    for (int i = 0; i < Math.min(estudiantes.size(), capacidadMaxima); i++) {
      this.estudiantes.set(estudiantes.get(i));
    }

    // Asignar estaciones
    for (Estacion estacion : estaciones) {
      this.estaciones.add(estacion);
    }

    // Calcular distancias entre estaciones
    double distanciaTotal = 0.0;
    for (int i = 0; i < this.estaciones.size() - 1; i++) {
      Estacion estacion1 = this.estaciones.get(i);
      Estacion estacion2 = this.estaciones.get(i + 1);
      double distancia = Math.sqrt(Math.pow(estacion2.getX() - estacion1.getX(), 2) + Math.pow(estacion2.getY() - estacion1.getY(), 2));
      distanciaTotal += distancia;
    }
    System.out.println("Distancia total: " + distanciaTotal);
  }
  
  public void simularRecorrido(int indicealumno) {
    // Calcular la distancia más corta a la siguiente estación
    int estacionActual = 0;
    while (estacionActual < estaciones.size()) {
      Estacion estacionDestino = null;
      double distanciaMinima = Double.MAX_VALUE;
        Iterable<Estacion> estaciones = null;
      for (Estacion estacion : estaciones) {
        double distancia = Math.sqrt(Math.pow(estacion.getCoordenadaY() - estaciones.get(estacionActual).getCoordenadaY(), 2) + 
                Math.pow(estacion.getCoordenadaX() - estaciones.get(estacionActual).getCoordenadaX(), 2));
        if (distancia < distanciaMinima) {
          distanciaMinima = distancia;
          estacionDestino = estacion;
        }
      }
      // Imprimir la ruta
      System.out.println("Pasando por: " + estaciones.get(estacionActual).getNombre() + " hacia " + estacionDestino.getNombre());

      // Bajar alumnos
      int cantidadAlumnos = alumno.size() / (estaciones.size() - estacionActual);
      if (cantidadAlumnos > 0) {
        ArrayList<alumno> alumnosABajar = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidadAlumnos; i++) {
          int indiceAlumno = random.nextInt(alumno.size(indiceAlumno));
          alumnosABajar.add(alumno.size(indicealumno));
          alumno.remove(indiceAlumno);
        }
        // Imprimir los alumnos que se bajaron
        System.out.println("Los alumnos " + alumnosABajar + " se bajaron en " + estacionDestino.getNombre());
      }

      // Moverse a la siguiente estación
      estacionActual = estaciones.indexOf(estacionDestino);
    }

    // Imprimir que el transporte ya terminó
    System.out.println("El transporte terminó, no hay más estaciones.");

    // El transportista se bajará
    transportista.setTransporteActual(null);
    System.out.println("El transportista " + transportista.getNombre() + " se bajó.");
  }

    private class estaciones {

        public estaciones() {
        }
    }
  
}




    