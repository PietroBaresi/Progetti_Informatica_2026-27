import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci le cordinate del primo punto");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println("Inserisci le cordinate del secondo punto");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        Punto a = new Punto(x1, y1);
        Punto b = new Punto(x2, y2);
        Rettangolo r = new Rettangolo(a, b);
        System.out.println(r);
    }
}
