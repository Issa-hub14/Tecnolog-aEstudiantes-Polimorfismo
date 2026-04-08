/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Matematicas extends Materia {
    
    public Matematicas(double notaMatematica){
        super("Matematicas", notaMatematica);
      
    }
    
  
    @Override 
    public double calcularDefinitiva(){
        double definitiva = nota * 0.45;
        return Math.round(definitiva * 100.0) / 100.0;
    }
    
}
