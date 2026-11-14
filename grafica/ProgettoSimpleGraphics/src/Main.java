import graphics.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("----- MENU ----- \n1. Se vuoi disegnare un cerchio \n2. Se vuoi disegnare un rettangolo \n3. Se vuoi disegnare un'immagine \n0. Se vuoi uscire");
        int scelta = in.nextInt();
        double x, y;
        String sposta, ingrandisci;

        while(scelta != 0) {
            if (scelta == 1) {
                Ellipse e = new Ellipse(100, 100, 200, 300);
                e.draw();
                System.out.println("Vuoi spostarlo? (S/N)");
                sposta = in.nextLine();
                while(sposta.equals("S")){
                    System.out.println("Di quanto vuoi spostarlo? (x/y)");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    e.translate(x,y);
                    System.out.println("Vuoi spostarlo ancora? (S/N)");
                    sposta = in.nextLine();
                }
                    System.out.println("Vuoi ingrandirlo? (S/N)");
                    ingrandisci = in.nextLine();
                    while (ingrandisci.equals("S")) {
                        System.out.println("Di quanto vuoi ingrandirlo? (w/h)");
                        x = in.nextDouble();
                        y = in.nextDouble();
                        e.grow(x, y);
                        System.out.println("Vuoi ingrandirlo? (S/N)");
                        ingrandisci = in.nextLine();
                    }
            } else if (scelta == 2) {
                Rectangle r = new Rectangle(50, 100, 200, 400);
                r.setColor(new Color(255, 0, 0));
                r.fill();
                System.out.println("Vuoi spostarlo? (S/N)");
                sposta = in.nextLine();
                while(sposta.equals("S")){
                    System.out.println("Di quanto vuoi spostarlo? (x/y)");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    r.translate(x,y);
                    System.out.println("Vuoi spostarlo ancora? (S/N)");
                    sposta = in.nextLine();
                }
                System.out.println("Vuoi ingrandirlo? (S/N)");
                ingrandisci = in.nextLine();
                while (ingrandisci.equals("S")) {
                    System.out.println("Di quanto vuoi ingrandirlo? (w/h)");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    r.grow(x, y);
                    System.out.println("Vuoi ingrandirlo? (S/N)");
                    ingrandisci = in.nextLine();
                }
            } else {
                Picture p = new Picture("java.png");
                p.draw();
                Text t = new Text(170, 450, "The Duke");
                t.setColor(new Color(255, 100, 0));
                t.grow(100, 40);
                t.draw();
                System.out.println("Vuoi spostarla? (S/N)");
                sposta = in.nextLine();
                while(sposta.equals("S")){
                    System.out.println("Di quanto vuoi spostarla? (x/y)");
                    x = in.nextDouble();
                    y = in.nextDouble();
                    p.translate(x,y);
                    System.out.println("Vuoi spostarla ancora? (S/N)");
                    sposta = in.nextLine();
                }
                    System.out.println("Vuoi ingrandirlo? (S/N)");
                    ingrandisci = in.nextLine();
                    while (ingrandisci.equals("S")) {
                        System.out.println("Di quanto vuoi ingrandirlo? (w/h)");
                        x = in.nextDouble();
                        y = in.nextDouble();
                        p.grow(x, y);
                        System.out.println("Vuoi ingrandirlo? (S/N)");
                        ingrandisci = in.nextLine();
                    }
            }
            if(sposta.equals("N") && ingrandisci.equals("N")){
                System.out.println("----- MENU ----- \n1. Se vuoi disegnare un cerchio \n2. Se vuoi disegnare un rettangolo \n3. Se vuoi disegnare un'immagine \n0. Se vuoi uscire");
                scelta = in.nextInt();
            }
        }
    }
}