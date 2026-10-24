import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Vettore {
    private Punto origine;
    private Punto vertice;

    public Vettore(Punto origine, Punto vertice){
        this.origine = origine;
        this.vertice = vertice;
    }

    public Punto getOrigine() {
        return origine;
    }

    public Punto getVertice() {
        return vertice;
    }

    public double calcolaLunghezza() {
        double lunghezza;
        double dx = vertice.getX() - origine.getX();
        double dy = vertice.getY() - origine.getY();
        lunghezza = sqrt(pow(dx, 2) + pow(dy, 2));
        return lunghezza;
    }

    public void spostaOrigine(Punto p){
         this.origine = p;
    }

    public boolean verificaOrigine(Punto p){
        return (this.origine.getX() == p.getX() && this.origine.getY() == p.getY());
    }

    @Override
    public String toString() {
        return "Cordinate del vettore: " +
                "origine: " + origine +
                "\n vertice: " + vertice;
    }
}
