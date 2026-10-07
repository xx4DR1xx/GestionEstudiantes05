package com.upn.code;

public class Estudiantes {

	private String nombre;
    private int edad;
    private double promedio;

    public Estudiantes (String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPromedio() { return promedio; }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio;
    }
}
