/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Estudiante {

    private String nombre;
    private int codigo;

    private Materia matematicas;
    private Materia desarrollo;

    public Estudiante(String nombre, int codigo, Materia matematicas, Materia desarrollo) {
        validarCodigo(codigo);

        this.nombre = nombre;
        this.codigo = codigo;
        this.matematicas = matematicas;
        this.desarrollo = desarrollo;
    }

    private void validarCodigo(int codigo) {
        if (codigo <= 21000) {
            throw new IllegalArgumentException("Código debe ser mayor a 21000");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Materia getDesarrollo() {
        return desarrollo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Codigo: " + codigo + "\n"
                + "Nota Desarrollo: " + desarrollo.calcularDefinitiva() + " - Nota Matematicas: " + matematicas.calcularDefinitiva() + "\n"
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
