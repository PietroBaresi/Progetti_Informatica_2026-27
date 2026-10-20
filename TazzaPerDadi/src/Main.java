import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TazzaPerDadi tazza;

        System.out.println("1) Tazza vuota con capienza massima N");
        System.out.println("2) Tazza automatica già riempita con N dadi da F facce");
        System.out.print("Scelta: ");
        int sceltaIniziale = scanner.nextInt();

        if (sceltaIniziale == 1) {
            System.out.print("Inserisci la capienza massima (N): ");
            int n = scanner.nextInt();
            tazza = new TazzaPerDadi(n);
            System.out.println("Tazza vuota creata con successo.\n");
        } else if (sceltaIniziale == 2) {
            System.out.print("Inserisci il numero di dadi (N): ");
            int n = scanner.nextInt();
            System.out.print("Inserisci il numero di facce (F): ");
            int f = scanner.nextInt();
            tazza = new TazzaPerDadi(n, f);
            System.out.println("Tazza automatica creata con successo.\n");
        } else {
            System.out.println("Scelta non valida. Chiudo il programma.");
            return;
        }

        int opzione;
        do {
            System.out.println("\n--- MENU DI TEST ---");
            System.out.println("1) Aggiungi un dado ");
            System.out.println("2) Lancia tutti i dadi ");
            System.out.println("3) Quanti dadi ci sono? ");
            System.out.println("4) Qual è la capienza massima?");
            System.out.println("5) La tazza è vuota? ");
            System.out.println("6) Punteggio minimo ottenibile ");
            System.out.println("7) Punteggio massimo ottenibile ");
            System.out.println("8) Mostra stato della tazza ");
            System.out.println("0) Esci");
            System.out.print("Scegli un'opzione: ");
            opzione = scanner.nextInt();

            switch (opzione) {
                case 1:
                    System.out.print("Inserisci le facce del dado da aggiungere: ");
                    int facce = scanner.nextInt();
                    if (tazza.add(facce)) {
                        System.out.println("Dado aggiunto con successo!");
                    } else {
                        System.out.println("Errore: la tazza è piena!");
                    }
                    break;
                case 2:
                    if (tazza.quanti() == 0) {
                        System.out.println("Non ci sono dadi da lanciare!");
                    } else {
                        System.out.println("Risultato del lancio totale: " + tazza.lancia());
                    }
                    break;
                case 3:
                    System.out.println("Dadi attualmente nella tazza: " + tazza.quanti());
                    break;
                case 4:
                    System.out.println("Capienza totale della tazza: " + tazza.size());
                    break;
                case 5:
                    System.out.println("La tazza è vuota? " + (tazza.isEmpty() ? "Sì" : "No"));
                    break;
                case 6:
                    System.out.println("Minimo possibile: " + tazza.getMinimo());
                    break;
                case 7:
                    System.out.println("Massimo possibile: " + tazza.getMassimo());
                    break;
                case 8:
                    System.out.println("\n" + tazza.toString());
                    break;
                case 0:
                    System.out.println("Uscita in corso... Ciao!");
                    break;
                default:
                    System.out.println("Opzione non valida, riprova.");
            }
        } while (opzione != 0);

        scanner.close();
    }
}