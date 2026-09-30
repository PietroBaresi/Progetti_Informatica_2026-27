import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il cognome: ");
        String cognome = in.nextLine();
        System.out.print("Inserisci il nome: ");
        String nome = in.nextLine();
        System.out.print("Inserisci il codice: ");
        String codice = in.nextLine();
        ContoCorrente c = new ContoCorrente(nome, cognome, codice);
        System.out.println("Conto corrente creato");

        System.out.println("----- MENU -----");
        System.out.println("Premere 1 se si vuole fare un deposito");
        System.out.println("Premere 2 se si vuole fare un prelievo");
        System.out.println("Premere 3 se si vuole vedere il saldo");
        System.out.println("Premere 4 se si vuole vedere il codice");
        System.out.println("Premere 5 se si vuole vedere il nominativo");
        System.out.println("Premere 6 se si vuole vedere tutte le informazioni del conto");
        System.out.println("Premere 0 se si vuole uscire dal programma");
        int scelta = in.nextInt();
        while(scelta > 0){
            if (scelta == 1){
                System.out.println("Quanto vuole depositare? ");
                double soldi = in.nextDouble();
                c.deposita(soldi);
            }
            else if (scelta == 2){
                System.out.println("Quanto vuole prelevare? ");
                double soldi = in.nextDouble();
                c.preleva(soldi);
            }
            else if (scelta == 3){
                System.out.println("Il saldo è di: " + c.getSaldo());
            }
            else if (scelta == 4){
                System.out.println("Il codice è: " + c.getCodice());
            }
            else if (scelta == 5) {
                System.out.println("Il nome del proprietario del conto corrente è: " +
                        c.getNominativo());
            }else if (scelta == 6){
                System.out.println(c);
            }
            System.out.println("----- MENU -----");
            System.out.println("Premere 1 se si vuole fare un deposito");
            System.out.println("Premere 2 se si vuole fare un prelievo");
            System.out.println("Premere 3 se si vuole vedere il saldo");
            System.out.println("Premere 4 se si vuole vedere il codice");
            System.out.println("Premere 5 se si vuole vedere il nominativo");
            System.out.println("Premere 6 se si vuole vedere tutte le informazioni del conto");
            System.out.println("Premere 0 se si vuole uscire dal programma");
            scelta = in.nextInt();
        }
    }
}