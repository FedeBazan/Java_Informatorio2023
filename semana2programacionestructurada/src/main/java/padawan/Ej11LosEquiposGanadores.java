package padawan;

public class Ej11LosEquiposGanadores {
    public static void main(String[] args) {
        String name1="Locros United";
        String name2="Uvita Tetra Fury";
        String coach1="Mileicius Xavier";
        String coach2="Massax Skinwalker";
        String team1jug1="Victoriana Countryruel";
        String team1jug2="Karixia Leon";
        String team2jug1="August Raxxi";
        String team2jug2="Albertus Fernandito";
        int recorrido=1;
        System.out.println("LOS JUEGOS DEL HAMBRE");
        while (recorrido<3){
            switch (recorrido){
                case 1:
                    System.out.println("--"+name1+"--");
                    System.out.println("Plantel: ");
                    System.out.println("1-"+team1jug1);
                    System.out.println("2-"+team1jug2);
                    System.out.println("Entrenador: "+coach1);
                    break;
                case 2:
                    System.out.println("--"+name2+"--");
                    System.out.println("Plantel: ");
                    System.out.println("1-"+team2jug1);
                    System.out.println("2-"+team2jug2);
                    System.out.println("Entrenador: "+coach2);
            }
            recorrido++;
        }
    }
}
