package com.upn.code;
import java.util.ArrayList;
import java.util.List;

public class GestionEstudiantes {

	private List<Estudiantes> listaEstudiantes;

    public GestionEstudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

  
    public void registrarEstudiantes(String nombre, int edad) {
        validarDatos(edad, 0.0);
        Estudiantes e = new Estudiantes(nombre, edad, 0.0);
        listaEstudiantes.add(e);
        System.out.println("Estudiante registrado exitosamente con promedio por defecto.");
    }

  
    public void registrarEstudiantes(String nombre, int edad, double promedio) {
        validarDatos(edad, promedio);
        Estudiantes e = new Estudiantes(nombre, edad, promedio);
        listaEstudiantes.add(e);
        System.out.println("Estudiante registrado exitosamente con promedio especificado.");
    }


    private void validarDatos(int edad, double promedio) {
        if (edad <= 0 || edad > 100) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0 y menor a 100.");
        }
        if (promedio < 0.0 || promedio > 20.0) {
            throw new IllegalArgumentException("El promedio debe estar entre 0.0 y 20.0.");
        }
    }


    public void mostrarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        for (Estudiantes e : listaEstudiantes) {
            System.out.println(e);
        }
    }
}
