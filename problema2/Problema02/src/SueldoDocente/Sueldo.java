/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SueldoDocente;

/**
 *
 * @author Usuario iTC
 */
public class Sueldo {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo;
    private double sueldoFinal;

    public Sueldo() {
        nombre = "Rene";
        apellido = "Elizalde";
        sueldo = 1500.99;
        cedula = "110726402";

    }

    public Sueldo(String nom, String apel, double suel, String cedu) {
        nombre = nom;
        apellido = apel;
        sueldo= suel;
        cedula = cedu;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerSueldoFinal() {
        sueldoFinal = sueldo + ((sueldo * 20) / 100);
    }
    
    // ------------------------------------------------------------------------

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoFinal() {
        return sueldoFinal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del docente: %s\nApellido del "
                + "docente: %s\nSueldo: %.2f\nCédula: %s\nSueldo Final: %.2f",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldo(),
                obtenerCedula(),
                obtenerSueldoFinal());
        return cadena;
    }
}
