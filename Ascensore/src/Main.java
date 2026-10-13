public class Main {
    public static void main(String[] args) {
        Ascensore a = new Ascensore(10);
        System.out.println(a);
        a.apri();
        System.out.println(a);
        a.chiudi();
        System.out.println(a);
        a.sali();
        System.out.println(a);
        a.scendi();
        System.out.println(a);
        a.vaiAlPiano(3);
        System.out.println(a);
    }
}