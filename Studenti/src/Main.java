public class Main {
    public static void main(String[] args) {
        Studente s;
        Studente s2;
        double BMI = 0;
        s = new Studente("Pietro", "Baresi", 16, 1.78, 64);
        s2 = new Studente("Anna", "Rossi", 18, 1.60, 55.4);
        System.out.println(s);
        System.out.println(s2);
        BMI = s.calcolaIndice();

        if(BMI < 18.5){
            System.out.println(" è sottopeso e il suo indice corporeo è " + BMI);
        }else if(BMI > 18.5 && BMI <=24.9){
            System.out.println(" è normopeso e il suo indice corporeo è " + BMI);
        }else if(BMI > 24.9 && BMI <= 29.9){
            System.out.println(" è sovrappeso e il suo indice corporeo è "  + BMI);
        }else{
            System.out.println(" è obeso e il suo indice corporeo è " + BMI);
        }

        System.out.println(s.mediaEta(s2));
        System.out.println(s.confrontaAltezze(s2));

    }
}