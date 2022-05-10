/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bancos;

/**
 *
 * @author Usuario iTC
 */
public class Cheque {
    private String nombre;
    private String banco;
    private double valor;
    private double comision;

    public Cheque() {
        nombre = "Ronin Carrion";
        banco = "Banco Internacional";
        valor = 17000.99;
    }

    public Cheque(String cli, String ban, double cheq) {
        nombre = cli;
        banco= ban;
        valor= cheq;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void estableceBanco(String n) {
        banco = n;
    }

    public void establecerValor(double n) {
        valor = n;
    }

    public void establecerComision() {
        comision = valor * ((valor * 0.003) / 100);
    }
    
    //-------------------------------------------------------------------------

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del cliente: %s\nNombre del banco: "
                + " %s\nValor del cheque: %.2f\nValor de la comisión: %.2f\n",
                obtenerNombre(),
                obtenerBanco(),
                obtenerValor(),
                obtenerComision());
        return cadena;
    }
}
