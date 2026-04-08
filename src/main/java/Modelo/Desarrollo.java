/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Desarrollo extends Materia {
    private double notaSoftware;
    private double notaHardware;
    
    public Desarrollo(double notaSoftware, double notaHardware){
        super("Desarrollo", 0);
        
        validarNota(notaSoftware);
        validarNota(notaHardware);
        
        this.notaSoftware = notaSoftware;
        this.notaHardware = notaHardware;
    }
    
    public double promedio(){
        return (notaSoftware+notaHardware)/2;
    }
    
    @Override 
    public double calcularDefinitiva(){
        double definitiva = promedio()*0.55;
        return Math.round(definitiva * 100.0) / 100.0;
        
    }
    
    @Override 
    public void incrementar(double incremento) {
        incrementarDesarrollo(incremento);
    }
    
    public void incrementarDesarrollo(double incremento) {
        notaHardware += incremento;
        notaSoftware += incremento;

        if (notaHardware > 5.0) {
            notaHardware = 5.0;
        }

        if (notaSoftware > 5.0) {
            notaSoftware = 5.0;
        }
    }
}
