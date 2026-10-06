public class Main {
    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        System.out.println(s);

        s.accendi();
        System.out.println(s);

        System.out.println(s.getColore());

        s.avanza();
        System.out.println(s);

        s.toggle();
        System.out.println(s);
        s.toggle();
        System.out.println(s);

        for (int i = 0; i < 10; i++) {
            s.avanza();
            System.out.println(s);
        }
    }
}