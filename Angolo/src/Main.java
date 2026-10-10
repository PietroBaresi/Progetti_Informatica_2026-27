import java.util.Scanner;

public class Main {
    public static Angolo creaAngolo(){
        Scanner in = new Scanner(System.in);
        Angolo a = new Angolo();
        System.out.println("Inserisci i gradi");
        int gradi = in.nextInt();
        a.setGradi(gradi);
        System.out.println("Inserisci i primi");
        int primi = in.nextInt();
        a.setPrimi(primi);
        System.out.println("Inserisci i secondi");
        int secondi = in.nextInt();
        a.setSecondi(secondi);
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Angolo a = new Angolo();
        Angolo b = new Angolo();
        Angolo c = new Angolo();

        int scelta;
        do {
            System.out.println("------- MENU -------");
            System.out.println("1. Crea un angolo");
            System.out.println("2. Somma due angoli");
            System.out.println("3. Sottrae due angoli");
            System.out.println("0. Esci");
            scelta = in.nextInt();

            switch (scelta){
                case 1:
                    System.out.println("Primo angolo");
                    a = creaAngolo();
                    System.out.println("Secondo angolo:");
                    b = creaAngolo();
                    System.out.println(a);
                    System.out.println(b);
                    break;
                case 2:
                    c = a.sommaAngolo(b);
                    System.out.println(c);
                    break;
                case 3:
                    c = a.sottraiAngolo(b);
                    System.out.println(c);
                    break;
            }
        }while(scelta != 0);

    }
}