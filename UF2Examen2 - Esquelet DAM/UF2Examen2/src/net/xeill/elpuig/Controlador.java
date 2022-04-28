package net.xeill.elpuig;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    private ArrayList<Alumne> lista_de_alumnos = new ArrayList();

    int IDAlumne = 1;
    public void CrearAlumne(Alumne alumne){
        alumne.setID(IDAlumne ++);
        lista_de_alumnos.add(alumne);
    }

    public void EliminarAlumne(int IDAlumne_a_eliminar) {
        for (Alumne a: lista_de_alumnos) {
            if(IDAlumne_a_eliminar == a.getID()){
                lista_de_alumnos.remove(a);
                break;
            }

        }
    }

    public void ModificarAlumne(int IDAlumne_a_modificar){
        Scanner scanner = new Scanner(System.in);
        for (Alumne a: lista_de_alumnos) {
            if(IDAlumne_a_modificar == a.getID()){
                System.out.println("Introdueix el nom de l'alumne:");
                String nombre = scanner.next();
                System.out.println("Introdueix els cognoms de l'alumne:");
                String apellido = scanner.next();
                System.out.println("Introdueix l'edat de l'alumne:");
                int edad = scanner.nextInt();
                System.out.println("Introdueix si està matriculat (si|no):");
                boolean matriculado = scanner.nextBoolean();
                System.out.println("Introdueix la nota mitjana (decimals):");
                float nota_mediana = scanner.nextFloat();

                a.setNombre(nombre);
                a.setApellido(apellido);
                a.setEdad(edad);
                a.setMatriculado(matriculado);
                a.setNotaMedia(nota_mediana);
            }
        }
    }

    public void VisualizarAlumne(int IDAlumno_a_visualizar){
        for (Alumne a: lista_de_alumnos) {
            if(IDAlumno_a_visualizar == a.getID()){
                System.out.println(a);
            }
        }
    }

   /* public void EliminarAlumne(int IDAlumne_a_eliminar) {
        for (Alumne a: lista_de_alumnos) {
            if(IDAlumne_a_eliminar == a.getID()){
                lista_de_alumnos.remove(a);
                break;
            }

        } */

    public void Visualizar_lista_de_alumnes(){
        System.out.println(lista_de_alumnos);
    }
}

