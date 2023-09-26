package padawan;

public class Ej01ConviertoLoQueMeDaLaGana {
    public static void main(String[] args) {
        //Se trabajara con un contador que imprima los primeros 5 numeros
        int contador=0;//Declaracion de la variable

        //TRABAJO CON WHILE
        System.out.println("Trabajo con el WHILE");
        while (contador!=5){
            System.out.println(contador+1);
            contador++;
        }
        contador=0;

        //TRABAJO CON DO-WHILE
        System.out.println("Trabajp con Do-While");
        do {
            contador++;
            System.out.println(contador);
        }while (contador!=5);

        /*
        * Conclusion:
        * El bucle DoWhile es conveniente usarlo cuando el codigo
        * requiera realizar primero un paso para seguir la ejecucion para que
        * de esta forma el control logico del While actue.
        * */
    }
}
