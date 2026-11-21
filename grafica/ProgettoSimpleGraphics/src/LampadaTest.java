import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LampadaTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Lampadina l = new Lampadina(100, 100, 100);
        System.out.println(l);

        System.out.println("Scegli azione (1=Accendi, 2=Spegni, 3=Nome, 4=Aumenta Lum, 5=Diminuisci Lum, 0=Esci):");
        int scelta = Integer.parseInt(reader.readLine());

        while (scelta != 0) {
            if (scelta == 1) {
                l.accendi();
            } else if (scelta == 2) {
                l.spegni();
            } else if (scelta == 3) {
                System.out.print("Inserisci il nuovo nome: ");
                String nuovoNome = reader.readLine();
                l.setNome(nuovoNome);
            } else if (scelta == 4) {
                l.aumentaLuminosita(20);
            } else if (scelta == 5) {
                l.diminuisciLuminosita(20);
            } else {
                System.out.println("Scelta non valida.");
            }

            System.out.println(l);
            System.out.println("Scegli azione (1=Accendi, 2=Spegni, 3=Nome, 4=Aumenta Lum, 5=Diminuisci Lum, 0=Esci):");
            scelta = Integer.parseInt(reader.readLine());
        }

        System.out.println("Programma terminato.");
    }
}
