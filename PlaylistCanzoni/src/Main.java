import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Playlist p = new Playlist("Rock anni sessanta", new Canzone[0]);
        int scelta;
        do {
            System.out.println("\n1 Aggiungi canzone  2 Mostra canzone  3 PLAY  4 PAUSE  5 STOP  6 Successivo  7 Precedente  8 Durata totale  0 Esci");
            scelta = in.nextInt();
            in.nextLine();
            if (scelta == 1) {
                System.out.print("Titolo: ");
                String t = in.nextLine();
                System.out.print("Artista: ");
                String a = in.nextLine();
                System.out.print("Minuti e secondi: ");
                p.add(new Canzone(t, new Duration(in.nextInt(), in.nextInt()), a));
            } else if (scelta == 2) {
                System.out.print("Numero: ");
                System.out.println(p.getCanzone(in.nextInt()));
            } else if (scelta == 3) p.play();
            else if (scelta == 4) p.pause();
            else if (scelta == 5) p.stop();
            else if (scelta == 6) p.branoSuccessivo();
            else if (scelta == 7) p.branoPrecedente();
            else if (scelta == 8) System.out.println(p.durataTotale());
            if (scelta >= 3 && scelta <= 7) System.out.println(p);
        } while (scelta != 0);
    }
}