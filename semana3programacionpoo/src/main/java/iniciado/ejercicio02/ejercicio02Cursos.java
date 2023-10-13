package iniciado.ejercicio02;

import iniciado.ejercicio01.Alumno;

public class ejercicio02Cursos {
    public static void main(String[] args) {
        //curso1
        Alumno alumno = new Alumno("Jose","martinez","12/12/1992",31);
        Curso curso1 = new Curso("Los del A",Boolean.TRUE,"Curso primero del turno manñana",alumno);
        System.out.println(curso1.toString());
        curso1 = new Curso("Los del A",Boolean.TRUE,"Curso primero del turno manñana",new Alumno("Fede","Bazan","19/12/1356",152));
        System.out.println(curso1.toString());
    }

}
