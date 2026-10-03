import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        Punto a = new Punto(0, 0);
        Punto b = new Punto(0, 0);
        Rettangolo r = new Rettangolo(a, b);

        System.out.println("-------MENU-------");
        System.out.println("0. per uscire");
        System.out.println("1. per creare un rettangolo");
        System.out.println("2. per calcolare il suo perimetro");
        System.out.println("3. per calcolare l'area");
        System.out.println("4. per vedere i dati");
        int scelta = in.nextInt();
        while (scelta > 0){
            if(scelta == 1){
                System.out.println("Inserisci le cordinate del primo punto");
                x1 = in.nextDouble();
                y1 = in.nextDouble();
                System.out.println("Inserisci le cordinate del secondo punto");
                x2 = in.nextDouble();
                y2 = in.nextDouble();
                a = new Punto(x1, y1);
                b = new Punto(x2, y2);
                r = new Rettangolo(a, b);
            }
            if (scelta == 2){
                System.out.println(r.perimetro());
            }
            if(scelta == 3){
                System.out.println(r.area());
            }
            if (scelta == 4){
                System.out.println(r);
            }
            System.out.println("-------MENU-------");
            System.out.println("0. per uscire");
            System.out.println("1. per creare un rettangolo");
            System.out.println("2. per calcolare il suo perimetro");
            System.out.println("3. per calcolare l'area");
            System.out.println("4. per vedere i dati");
            scelta = in.nextInt();
        }

    }
}
