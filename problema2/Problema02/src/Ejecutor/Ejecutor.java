/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import SueldoDocente.Sueldo;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "David";
        String apellido = "Carrion";
        double sueldo = 950.99;
        String cedula = "1104928471";
        
        Sueldo docente1 = new Sueldo();
        docente1.establecerSueldoFinal();

        Sueldo docente2 = new Sueldo(nombre, apellido, sueldo, cedula);
        docente2.establecerSueldoFinal();

        System.out.println(docente1);      
        System.out.println("----------------------------------------");        
        System.out.println(docente2);
    }
    
}
