import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        LocalDate oggi = LocalDate.now();
        System.out.println("Oggi è il " + oggi);
        LocalDate domani = oggi.plusDays(1);
        LocalDate meseProssimo = oggi.plusMonths(1);
        LocalDate annoProssimo = oggi.plusYears(1);
        System.out.println("Domani sarà " + domani + " fra un mese la data sarà: "
                            + meseProssimo + " e fra un anno sarà: " + annoProssimo);
    }
}