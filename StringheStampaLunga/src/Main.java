import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        String t;
        System.out.println("Inserisci una stringa");
        s = in.next();
        System.out.println("Inserisci una seconda stringa");
        t = in.next();

        if(s.length() > t.length()){
            System.out.println("La prima stringa (" + s + ") è più lunga");
        }else{
            System.out.println("La seconda stringa (" + t + ") è più lunga");
        }
    }
}