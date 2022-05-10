/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutoMovil;

/**
 *
 * @author Usuario iTC
 */
public class Automovil {

    private String cedula;
    private String marca;
    private int anio;
    private double valorAutomovil;
    private double valorMatricula;

    public Automovil() {
        cedula = "091824710";
        marca = "Susuki";
        anio = 2003;
        valorAutomovil = 45750.99;

    }

    public Automovil(String ced, String mar, int year, double val) {
        cedula = ced;
        marca = mar;
        anio = year;
        valorAutomovil = val;

    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerMarca(String n) {
        marca= n;
    }

    public void establecerAnio(int n) {
        anio = n;
    }

    public void establecerValorAutomovil(double n) {
        valorAutomovil = n;
    }

    public void establecerValorMatricula() {
        valorMatricula = anio * ((valorAutomovil * 0.002) / 100);
    }
    
    //-----------------------------------------------------------------------

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cédula del Usuario: %s\nMarca del "
                + "Automovil: %s\nAnio de fabricación: %d\nValor del Automovil"
                + ": %.2f\nValor de la matrícula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnio(),
                obtenerValorAutomovil(),
                obtenerValorMatricula());
        return cadena;
    }
}
