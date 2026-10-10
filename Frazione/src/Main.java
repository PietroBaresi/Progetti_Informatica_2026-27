import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Frazione f = new Frazione();
        Frazione nuova = new Frazione();
        System.out.println("Inserisci numeratore");
        int num = in.nextInt();
        f.setNumeratore(num);
        System.out.println("Inserisci denominatore");
        int den = in.nextInt();
        f.setDenominatore(den);
        System.out.println(f);

        f.semplificaFrazione();
        System.out.println(f);

        nuova = f.reciprocaFrazione();
        System.out.println(nuova);
        nuova = f.oppostaFrazione();
        System.out.println(nuova);

        Frazione f1 = new Frazione();
        System.out.println("Inserisci numeratore della frazione che vuoi sommare");
        int num1 = in.nextInt();
        f1.setNumeratore(num1);
        System.out.println("Inserisci denominatore della frazione che vuoi sommare");
        int den1 = in.nextInt();
        f1.setDenominatore(den1);
        nuova = f.sommaFrazione(f1);
        System.out.println(nuova);

        nuova = f.sottraiFrazione(f1);
        System.out.println(nuova);

        nuova = f.moltiplicaFrazione(f1);
        System.out.println(nuova);

        nuova = f.dividiFrazione(f1);
        System.out.println(nuova);

        nuova = f.elevaFrazione(2);
        System.out.println(nuova);
    }
}