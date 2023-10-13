package iniciado.ejercicio02;

import iniciado.ejercicio01.Alumno;

public class Curso {
    private String nombre;
    private boolean habilitada;
    private String descripcion;
    private Alumno alumno =new Alumno();

    public Curso(String nombre, boolean habilitada, String descripcion, Alumno alumno) {
        this.nombre = nombre;
        this.habilitada = habilitada;
        this.descripcion = descripcion;
        this.alumno = alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", habilitada=" + habilitada +
                ", descripcion='" + descripcion + '\'' +
                ", alumno=" + alumno +
                '}';
    }
}
