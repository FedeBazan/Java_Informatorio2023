package Ejercicios_Padawan_JAVA_JEDI;

public class Ej03_Caracteres {
    public static void main(String[] args) {
        char letterA = '\u0046';
        char letterB = '\u0045';
        char letterC = '\u0044';
        System.out.println(letterA+""+letterB+letterC+letterB);
        //No se puede usar "" por que esta reservado para String, Java interpreta la espera de una cadena de caracteres y no de un char
        //Unicode es un estandar de codificacion de caracteres que representa caracteres de forma numerica, este estadar es universal y se utiliza en todos los idiomas
    }
}
