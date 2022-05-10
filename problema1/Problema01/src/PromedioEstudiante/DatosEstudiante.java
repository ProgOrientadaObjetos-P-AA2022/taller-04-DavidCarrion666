/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PromedioEstudiante;

/**
 *
 * @author Usuario iTC
 */
public class DatosEstudiante {

    private String nombre;
    private double cal1;
    private double cal2;
    private double cal3;
    private double promedio;

    public DatosEstudiante() {
        nombre = "Ronnin Carrion";
        cal1 = 9.75;
        cal2 = 8.50;
        cal3 = 7.00;

    }

    public DatosEstudiante(String n, double nota1, double nota2, double nota3) {
        nombre = n;
        cal1 = nota1;
        cal2 = nota2;
        cal3 = nota3;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCalificacion1(double n) {
        cal1 = n;
    }

    public void establecerCalificacion2(double n) {
        cal2 = n;
    }

    public void establecerCalificacion3(double n) {
        cal3 = n;
    }

    public void establecerPromedio() {
        promedio = (cal1 + cal2 + cal3) / 3;
    }
    
    // ----------------------------------------------------------------------

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCalificacion1() {
        return cal1;
    }

    public double obtenerCalificacion2() {
        return cal2;
    }

    public double obtenerCalificacion3() {
        return cal3;
    }

    public double obtenerPromedio() {
        return promedio;

    }
    
    @Override
    public String toString(){
    String cadena = String.format("Nombre del estudiante: %s\n"
                + "Calificacion numero 1: %.2f\nCalificacion numero 2: %.2f\n"
                + "Calificacion numero 3: %.2f\nPromedio final: %.2f",
                obtenerNombre(),
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());
        return cadena;
    }
}
