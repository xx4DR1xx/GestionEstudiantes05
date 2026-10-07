package com.upn.code;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ DE GESTION DE ESTUDIANTES ===");
            System.out.println("1. Registrar estudiante sin promedio ");
            System.out.println("2. Registrar estudiante con promedio ");
            System.out.println("3. Lista estudiantes ");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

       
            try {
                int opcion = teclado.nextInt();
                teclado.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nom1 = teclado.nextLine();
                        System.out.print("Edad: ");
                        int edad1 = teclado.nextInt();
                        teclado.nextLine();
                      
                        gestion.registrarEstudiantes(nom1, edad1);
                        break;

                    case 2:
                        System.out.print("Nombre: ");
                        String nom2 = teclado.nextLine();
                        System.out.print("Edad: ");
                        int edad2 = teclado.nextInt();
                        System.out.print("Promedio (0 a 20): ");
                        double prom2 = teclado.nextDouble();
                        teclado.nextLine();
                        
                        gestion.registrarEstudiantes(nom2, edad2, prom2);
                        break;

                    case 3:
                        gestion.mostrarEstudiantes();
                        break;

                    case 4:
                        salir = true;
                        System.out.println("Programa finalizado.");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero valido.");
                teclado.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Error de validacion: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        teclado.close();
    }
}
