import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LampadaTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Lampadina l = new Lampadina(100, 100, 100);
        System.out.println(l);

        System.out.println("Scegli azione (1=Accendi, 2=Spegni, 3=Nome, 4=Colore, 5=Luminosita, 0=Esci):");
        int scelta = Integer.parseInt(reader.readLine());

        while (scelta != 0) {
            if (scelta == 1) {
                l.accendi();
            } else if (scelta == 2) {
                l.spegni();
            } else if (scelta == 3) {
                l.setNome("Cucina1");
            } else if (scelta == 4) {
                System.out.print("Inserisci colore: ");
                String colore = reader.readLine();
                l.setColore(colore);
            } else if (scelta == 5) {
                System.out.print("Premi 1 per aumentare bianco, 2 per diminuire: ");
                int ill = Integer.parseInt(reader.readLine());
                System.out.print("Inserisci quantita: ");
                int quantita = Integer.parseInt(reader.readLine());

                if (ill == 1) {
                    l.aumentaLuminosita(quantita);
                } else {
                    l.diminuisciLuminosita(quantita);
                }
            }

            System.out.println(l);
            System.out.println("Scegli azione (1=Accendi, 2=Spegni, 3=Nome, 4=Colore, 5=Luminosita, 0=Esci):");
            scelta = Integer.parseInt(reader.readLine());
        }
    }
}
