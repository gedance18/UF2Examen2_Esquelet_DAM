package net.xeill.elpuig;

public class Alumne {
    private int ID;
    private String nombre;
    private String apellido;
    private int edad;
    private boolean matriculado;
    private float notaMedia;
    private enum Cicle{
        SMX, ASIX, DAM
    }
    private Cicle cicle;

    public Alumne(String nombre, String apellido, int edad, boolean matriculado, float notaMedia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.matriculado = matriculado;
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        if (this.matriculado){
            return "Alumne{" +
                    "ID=" + ID +
                    ", nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", edad=" + edad +
                    ", matriculado= SI" +
                    ", notaMedia=" + notaMedia +
                    ", cicle=" + cicle +
                    '}';
        } else {

        }
        return "Alumne{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", matriculado= NO"+
                ", notaMedia=" + notaMedia +
                ", cicle=" + cicle +
                '}';
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public Cicle getCicle() {
        return cicle;
    }

    public void setCicle(Cicle cicle) {
        this.cicle = cicle;
    }
}
