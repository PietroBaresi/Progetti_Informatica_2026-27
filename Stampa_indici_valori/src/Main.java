public class Main {
    public static void main(String[] args) {
        int [] a;
        a = new int [10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 9){
                System.out.print(a[i] + "  ");
            }else{
                System.out.print(a[i] + "   ");
            }
        }
    }
}