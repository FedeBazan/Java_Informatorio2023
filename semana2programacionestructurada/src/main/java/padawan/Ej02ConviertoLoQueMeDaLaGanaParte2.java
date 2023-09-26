package padawan;

public class Ej02ConviertoLoQueMeDaLaGanaParte2 {
    public static void main(String[] args) {
        //Se trabajara con un contador que imprima los primeros 5 numeros
        int contador=0;//Declaracion de la variable

        //TRABAJO CON WHILE
        System.out.print("Trabajo con el WHILE: ");
        while (contador!=5){
            System.out.print(contador+1);
            contador++;
        }
        contador=0;

        System.out.print("\nTrabajo con el For:  ");
        for (;contador!=5;contador++) System.out.print(contador+1);
    }
}
