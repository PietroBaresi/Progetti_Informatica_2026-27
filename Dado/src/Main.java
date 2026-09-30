import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dado d1 = new Dado();
        System.out.println(d1);

        Dado d2 = new Dado(12);
        System.out.println(d2);

        System.out.println("Risultato del lancio: " + d2.lancia());

        Dado d = new Dado();
        System.out.println("1. Crea un nuovo dado");
        System.out.println("2. Visualizza numero di facce del dado");
        System.out.println("3. Lancia il dado");
        System.out.println("0. Esci dal programma");
        System.out.print("Scegli un'opzione: ");
        int scelta = in.nextInt();

        while(scelta != 0) {
            if (scelta == 1) {
                System.out.print("Inserisci il numero di facce: ");
                int facce = in.nextInt();
                d = new Dado(facce);
            } else if (scelta == 2) {
                System.out.println(d);
            } else if (scelta == 3) {
                System.out.println("È uscito il numero: " + d.lancia());
            }
            System.out.println("1. Crea un nuovo dado");
            System.out.println("2. Visualizza numero di facce del dado");
            System.out.println("3. Lancia il dado");
            System.out.println("0. Esci dal programma");
            System.out.print("Scegli un'opzione: ");
            scelta = in.nextInt();
        }
        System.out.println("Fine programma");
    }
}
