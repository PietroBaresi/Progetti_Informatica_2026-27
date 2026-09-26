public class Main {
    public static void main(String[] args) {
        //creazione lampadina
        Lampadina lampada1 = new Lampadina(60);
        lampada1.setNome("Salotto");
        System.out.println(lampada1.getNome());
        lampada1.accendi(); //test del metodo accendi
        System.out.println(lampada1);

        lampada1.aumentaLuminosita();//test del metodo aumenta
        lampada1.aumentaLuminosita();
        System.out.println(lampada1);
        lampada1.diminuisciLuminosita(); //test del metodo diminuisci
        System.out.println(lampada1);
        lampada1.spegni(); //test del metodo spegni
        System.out.println(lampada1);

        Lampadina lampada2 = new Lampadina(lampada1);
        System.out.println("Lampadina copiata:"); //lampadina2 uguale a lampadina1
        System.out.println(lampada2);

        Lampadina lampada3 = new Lampadina(150);

        System.out.println("Lampadina con potenza non valida:");
        System.out.println(lampada3);
    }
}