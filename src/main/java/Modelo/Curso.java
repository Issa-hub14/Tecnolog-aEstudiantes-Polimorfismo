/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Curso {
 private Estudiante[] estudiantes;
    private int contador;

    public Curso(int cantidad) {
        this.estudiantes = new Estudiante[cantidad];
        this.contador = 0;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public String agregarEstudiante(Estudiante nuevoEstudiante) {

        if (contador < estudiantes.length) {
            estudiantes[contador] = nuevoEstudiante;
            contador++;
            return "Estudiante agregado correctamente.";
        }
        return "No se pueden agregar más estudiantes.";
    }

    public void ordenarAscendente() {

        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (estudiantes[j].calcularDefinitiva()
                        > estudiantes[j + 1].calcularDefinitiva()) {

                    Estudiante temporal = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temporal;
                }
            }
        }
    }

    public String mostrarEstudiantes() {
        if (contador == 0) {
            return "No hay estudiantes registrados.";
        }

        String lista = "Lista de Estudiantes:\n";
        for (int i = 0; i < contador; i++) {
            lista += "[" + i + "] " + estudiantes[i].toString() + "\n";
        }
        return lista;
    }

    public Estudiante buscarEstudiante(int codigo) {
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public String listaMayorA(double notaLimite) {
        if (contador == 0) {
            return "No hay estudiantes registrados.";
        }

        String lista = "Estudiantes con definitiva mayor a " + notaLimite + "\n";
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i].calcularDefinitiva() >= notaLimite) {
                lista += estudiantes[i].toString() + "\n";
            }
        }
        return lista;

    }

}
