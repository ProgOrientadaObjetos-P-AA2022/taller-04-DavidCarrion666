/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor; 

/**
 *
 * @author Usuario iTC
 */
import PromedioEstudiante.DatosEstudiante;
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "David Carrion";
        double cal1 = 9.50;
        double cal2 = 7.40;
        double cal3 = 8.00;
        
        DatosEstudiante estudiante1 = new DatosEstudiante();
        estudiante1.establecerPromedio();
        
        DatosEstudiante estudiante2 = new DatosEstudiante(nombre, cal1, cal2,
                cal3);
        
        estudiante2.establecerPromedio();
        
        System.out.println(estudiante1);
        System.out.println("-----------------------------------------");
        System.out.println(estudiante2);
    }
    
}
