/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Estudiante extends Persona {

    private Materia matematicas;
    private Materia desarrollo;

    public Estudiante(String nombre, int codigo, Materia matematicas, Materia desarrollo) {
        super(nombre, codigo);
        this.matematicas = matematicas;
        this.desarrollo = desarrollo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Materia getDesarrollo() {
        return desarrollo;
    }

    public Materia getMatematicas() {
        return matematicas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Codigo: " + codigo + "\n"
                + "Nota Desarrollo: " + desarrollo.mostrarNota() + " - Nota Matematicas: " + matematicas.mostrarNota() + "\n"
                + " - Definitiva: " + calcularDefinitiva()
                + " - " + aprobacion();
    }

    public double calcularDefinitiva() {
        double definitiva = (double) (matematicas.calcularDefinitiva() + desarrollo.calcularDefinitiva());
        definitiva = Math.round(definitiva * 100.0) / 100.0;
        return definitiva;

    }

    public String aprobacion() {
        if (calcularDefinitiva() < 3.5) {
            return ("NO APRUEBA");
        }
        return ("SI APRUEBA");
    }

}
