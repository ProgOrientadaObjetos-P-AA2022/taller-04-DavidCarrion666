/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import AutoMovil.Automovil;

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
        
        String cedula = "1102891726";
        String marca = "Tesla";
        int anio = 2012;
        double valorMatricula = 18273.99;

        Automovil automotor1 = new Automovil();
        automotor1.establecerValorMatricula();

        Automovil automotor2 = new Automovil(cedula, marca, anio, valorMatricula);
        automotor2.establecerValorMatricula();

        System.out.println(automotor1);
        System.out.println("----------------------------------------");
        System.out.println(automotor2);
    }

}
