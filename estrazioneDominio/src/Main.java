import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mail;
        String[] dominio;
        System.out.println("Inserisci la tua mail");
        mail = in.next();
        dominio = mail.split("@");
        if(dominio.length > 1){
            System.out.println(dominio[1]);
        }else{
            System.out.println("Email non valida");
        }
    }
}
