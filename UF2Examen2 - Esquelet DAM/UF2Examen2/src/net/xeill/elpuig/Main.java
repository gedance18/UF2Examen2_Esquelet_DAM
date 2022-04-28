package net.xeill.elpuig;

import java.util.Scanner;
// Siempre que se introduzca un int edat = scanner.nextInt() osea un int, hay que poner debajo un scanner.nextLine(), porque si no se guarda el enter de nextInt en el siguiente scanner que seria matriculado
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        while (true) {
            int opcio = menu(scanner);

                scanner.nextLine();

            if (opcio == 1) {
                System.out.println("Introdueix el nom de l'alumne:");
                String nombre = scanner.nextLine();

                System.out.println("Introdueix els cognoms de l'alumne:");
                String apellido = scanner.nextLine();

                System.out.println("Introdueix l'edat de l'alumne:");
                int edad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introdueix si està matriculat (si|no):");

                String matriculado = scanner.nextLine();
                boolean matric = false;

                if(matriculado.equals("si")){
                    matric = true;
                } else {
                    matric = false;
                }

                System.out.println("Introdueix la nota mitjana (decimals):");
                float nota_mediana = scanner.nextFloat();
                scanner.nextLine();

                System.out.println("Introdueix el cicle (SMX|ASIX|DAM):");


                Alumne alumne = new Alumne(nombre, apellido, edad, matric, nota_mediana);
                controlador.CrearAlumne(alumne);
            } else if (opcio == 2) {
                System.out.println("Que Alumno quieres modificar?: (Escribe su ID)");
                int Alumno_a_modificar = scanner.nextInt();
                controlador.ModificarAlumne(Alumno_a_modificar);
            } else if (opcio == 3) {
                System.out.println("Que Alumno quieres eliminar?: (Escrbe su ID)");
                int Alumno_a_eliminar = scanner.nextInt();
                controlador.EliminarAlumne(Alumno_a_eliminar);
            } else if (opcio == 4) {
                System.out.println("Que Alumno quieres ver?: (Escribe su ID)");
                int Alumno_a_visualizar = scanner.nextInt();
                controlador.VisualizarAlumne(Alumno_a_visualizar);
            } else if (opcio == 5) {
                controlador.Visualizar_lista_de_alumnes();
            } else if (opcio == 6) {
                System.out.println("Has salido de la aplicación");
                break;
            }

        }
    }
    private static int menu(Scanner scanner) {

            System.out.println("Escull una opció:");
            System.out.println("   1: Crear un nou alumne.");
            System.out.println("   2: Modificar un alumne existent.");
            System.out.println("   3: Esborrar un alumne existent.");
            System.out.println("   4: Llistar un alumne existent.");
            System.out.println("   5: Llistar tots els alumne existents.");
            System.out.println("   6: Sortir.");

            return scanner.nextInt();
    }
}
