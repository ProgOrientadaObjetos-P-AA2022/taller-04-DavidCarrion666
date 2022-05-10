/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import Bancos.Cheque;

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
        
        String nombre = "David Carrion";
        String banco = "Banco De Loja";
        double valor = 15000.50;
        
         Cheque cheque1 = new Cheque();
        cheque1.establecerComision();

        Cheque cheque2 = new Cheque(nombre, banco, valor);
        cheque2.establecerComision();

        System.out.println(cheque1);       
        System.out.println("----------------------------------------");       
        System.out.println(cheque2);
    }
    
}
