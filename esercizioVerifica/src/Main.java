import java.util.Scanner;

public class Main {
    public static Punto creaPunto(double x, double y){
        Punto p = new Punto(x, y);
        return p;
    }
    public static Vettore creaVettore(Punto origine, Punto vertice){
        Vettore v = new Vettore(origine, vertice);
        return v;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vettore v = null;
        Vettore v2 = null;
        int scelta;
        do {
            System.out.println("------- MENU -------");
            System.out.println("1. Definisci i vettori v e v2");
            System.out.println("2. Visualizza le coordinate dei vettori");
            System.out.println("3. Calcola la lunghezza dei vettori");
            System.out.println("4. Sposta l'origine di un vettore");
            System.out.println("5. Verifica se v e v2 hanno origine uguale");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = in.nextInt();

            switch (scelta){

                case 1:
                    System.out.println("Inserisci le coordinate dell'origine del primo vettore (x, y)");
                    double origineX = in.nextDouble();
                    double origineY = in.nextDouble();
                    Punto origine1 = creaPunto(origineX, origineY);

                    System.out.println("Inserisci le coordinate del vertice del primo vettore  (x, y)");
                    double verticeX = in.nextDouble();
                    double verticeY = in.nextDouble();
                    Punto vertice1 = creaPunto(verticeX, verticeY);

                    v = creaVettore(origine1, vertice1);

                    System.out.println("Inserisci le coordinate dell'origine del secondo vettore  (x, y)");
                    double origineX2 = in.nextDouble();
                    double origineY2 = in.nextDouble();
                    Punto origine2 = creaPunto(origineX2, origineY2);

                    System.out.println("Inserisci le coordinate del vertice del secondo vettore  (x, y)");
                    double verticeX2 = in.nextDouble();
                    double verticeY2 = in.nextDouble();
                    Punto vertice2 = creaPunto(verticeX2, verticeY2);

                    v2 = creaVettore(origine2, vertice2);
                    break;

                case 2:
                    if (v == null || v2 == null) {
                        System.out.println("Errore: Definisci prima i vettori.");
                    } else {
                        System.out.print(v);
                        System.out.print(v2);
                    }
                    break;

                case 3:
                    if (v == null || v2 == null) {
                        System.out.println("Errore: Definisci prima i vettori.");
                    } else {
                        System.out.println("Lunghezza v: " + v.calcolaLunghezza());
                        System.out.println("Lunghezza v2: " + v2.calcolaLunghezza());
                    }
                    break;

                case 4:
                    if (v == null || v2 == null) {
                        System.out.println("Errore: Definisci prima i vettori.");
                    } else {
                        System.out.println("Di quale vettore vuoi spostare l'origine? (1 per v, 2 per v2): ");
                        int vScelta = in.nextInt();
                        System.out.println("Nuova X origine: ");
                        double nuovaX = in.nextDouble();
                        System.out.print("Nuova Y origine: ");
                        double nuovaY = in.nextDouble();
                        Punto nuovaOrigine = creaPunto(nuovaX, nuovaY);

                        if (vScelta == 1) {
                            v.spostaOrigine(nuovaOrigine);
                        } else if (vScelta == 2) {
                            v2.spostaOrigine(nuovaOrigine);
                        } else {
                            System.out.println("Scelta non valida.");
                        }
                    }
                    break;

                case 5:
                    if (v == null || v2 == null) {
                        System.out.println("Errore: Definisci prima i vettori.");
                    } else {
                        if (v.verificaOrigine(v2.getOrigine())) {
                            System.out.println("I vettori hanno la stessa origine.");
                        } else {
                            System.out.println("I vettori hanno origini diverse.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Uscita");
                    break;
            }
        }while(scelta != 0);
    }
}