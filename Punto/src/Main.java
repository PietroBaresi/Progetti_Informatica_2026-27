public class Main{
    public static void main (String[] args){
        Punto a = new Punto(12, 6);
        Punto b = new Punto(7, 9);
        System.out.println(a.distanza(b));
        System.out.println(a.medio(b));
        System.out.println(a);
    }
}