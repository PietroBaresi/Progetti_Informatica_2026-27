import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a;
        a = new int[10];
        int n = 0;
        int conta = 0;
        while (conta < a.length){
            n = in.nextInt();
            if (n < 0){
                break;
            }
            a[conta] = n;
            conta ++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}