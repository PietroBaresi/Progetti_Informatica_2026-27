import graphics.Ellipse;

import java.util.Scanner;

public class Esempio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quante palline vuoi?");
        int n = in.nextInt();
        Ellipse[] e = new Ellipse[n];
        for (int i = 0; i < e.length; i++) {
            e[i] = new Ellipse(10 * i, 10 * i, 30, 30);
            e[i].draw();
        }
        for (int i = 0; i < e.length; i++) {
            int x = 10 * i;
            int y = 10 * (e.length - 1 - i);
            e[i] = new Ellipse(x, y, 30, 30);
            e[i].draw();
        }
    }
}
