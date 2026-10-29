import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String mail;
        System.out.println("Inserisci la tua mail");
        mail = in.next();
        String[] dominio = mail.split("@");
        String[] dominioLivello1 = dominio[1].split("\\.");
        System.out.println(dominioLivello1[1]);

    }
}
