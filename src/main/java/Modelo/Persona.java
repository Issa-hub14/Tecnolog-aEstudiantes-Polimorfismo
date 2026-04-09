/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Persona {
    protected String nombre;
    protected int codigo;
    
     public Persona(String nombre, int codigo) {
        validarCodigo(codigo);
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    } 
     
    private void validarCodigo(int codigo) {
        if (codigo <= 21000) {
            throw new IllegalArgumentException("Código debe ser mayor a 21000");
        }
    }
}
