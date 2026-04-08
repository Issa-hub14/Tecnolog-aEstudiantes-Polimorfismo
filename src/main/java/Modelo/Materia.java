/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Materia {

    protected String nombre;
    protected double nota;

    public Materia(String nombre, double nota) {
        validarNota(nota);
        this.nombre = nombre;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public double calcularDefinitiva() {
        return nota;
    }

    protected void validarNota(double nota) {
        if (nota < 0 || nota > 5) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 5");
        }
    }
    
    public void incrementar(double incremento) {
    }
}
