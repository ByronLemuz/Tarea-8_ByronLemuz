/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg8_byronlemuz;
import javax.swing.JOptionPane;
/**
 *
 * @author lesly
 */
public class Tarea8_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    


    int opcion = 0;
    while (opcion != 0) {
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú principal:\n"
          + "0. Salir\n"
          + "1. Crear Clase\n"
          + "2. Crear Ruta\n"
          + "3. Crear Alumno\n"
          + "4. Agregar Clase a Alumno\n"
          + "5. Crear Transportista\n"
          + "6. Crear Transporte\n"
          + "7. Simulación\n"
          + "8. Listar Clases\n"
          + "9. Listar Rutas\n"
          + "10. Listar Alumnos\n"
          + "11. Listar Transportistas\n"
          + "12. Listar Transportes"));
      
      switch (opcion) {
        case 7:
          int opcionSimulacion = 0;
          while (opcionSimulacion != 0) {
            opcionSimulacion = Integer.parseInt(JOptionPane.showInputDialog("Menú simulación:\n"
                + "0. Salir\n"
                + "1. Subir alumno al transporte\n"
                + "2. Bajar alumno del transporte\n"
                + "3. Listar alumnos del transporte\n"
                + "4. Escoger transportista\n"
                + "5. Quitar transportista\n"
                + "6. Añadir ruta\n"
                + "7. Quitar ruta\n"
                + "8. Imprimir transporte\n"
                + "9. Comenzar"));
            
            switch (opcionSimulacion) {
              case 0:
                break;
              case 1:
                // Acción para subir alumno al transporte
                break;
              case 2:
                // Acción para bajar alumno del transporte
                break;
              case 3:
                // Acción para listar los alumnos que van en el transporte
                break;
              case 4:
                // Acción para escoger transportista
                break;
              case 5:
                // Acción para quitar al transportista
                break;
              case 6:
                // Acción para añadir la ruta
                break;
              case 7:
                // Acción para quitar la ruta
                break;
              case 8:
                // Acción para imprimir el transporte asignado
                break;
              case 9:
                
                break;
              default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
            }
                    }
            }
        }
    }
}
          

    
    

