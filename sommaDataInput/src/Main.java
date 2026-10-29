import java.time.LocalDate;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int giorno;
        int mese;
        int anno;
        System.out.println("Inserisci il giorno, il mese e l'anno");
        giorno = in.nextInt();
        mese = in.nextInt();
        anno = in.nextInt();
        LocalDate data = LocalDate.of(anno, mese, giorno);
        System.out.println("La tua data: " + data);
        LocalDate domani = data.plusDays(1);
        LocalDate meseProssimo = data.plusMonths(1);
        LocalDate annoProssimo = data.plusYears(1);
        System.out.println("Il giorno dopo sarà " + domani + " fra un mese la data sarà: "
                + meseProssimo + " e fra un anno sarà: " + annoProssimo);
    }
}