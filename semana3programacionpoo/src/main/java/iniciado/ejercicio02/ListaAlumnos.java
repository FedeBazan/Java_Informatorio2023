package iniciado.ejercicio02;

import iniciado.ejercicio01.Alumno;

import java.util.ArrayList;

public class ListaAlumnos {

    private Alumno alumno = new Alumno();
    private String nombre;
    private String apellido;
    private String fechaNac;
    private int edad;
    private int cantidadAlumnos=3;
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public void cargarAlumnos (){
        listaAlumnos.add("");   
    }
    
}
