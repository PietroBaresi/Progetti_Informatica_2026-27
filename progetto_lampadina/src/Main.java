public class Main {
    public static void main(String[] args) {
        Lampadina lampada1 = new Lampadina(60);
        lampada1.setNome("Salotto");
        System.out.println("Nome della lampadina:");
        System.out.println(lampada1.getNome());
        lampada1.accendi();
        System.out.println(lampada1);

        lampada1.aumentaLuminosita();
        lampada1.aumentaLuminosita();
        System.out.println(lampada1);
        lampada1.diminuisciLuminosita();
        System.out.println(lampada1);
        lampada1.spegni();
        System.out.println(lampada1);

        Lampadina lampada2 = new Lampadina(lampada1);
        System.out.println("Lampadina copiata:");
        System.out.println(lampada2);

        // Test potenza non valida
        Lampadina lampada3 = new Lampadina(150);

        System.out.println("Lampadina con potenza non valida:");
        System.out.println(lampada3);
    }
}