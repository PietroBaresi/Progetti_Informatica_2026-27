public class Dado {
    private int nFacce;

    // Costruttore vuoto
    public Dado() {
        this.nFacce = 6;
    }

    // Costruttore
    public Dado(int n) {
        if (n < 2 || n == 3) {
            this.nFacce = 6;
        } else {
            this.nFacce = n;
        }
    }

    // Costruttore di copia
    public Dado(Dado d) {
        this.nFacce = d.nFacce;
    }

    // Metodo lancia
    public int lancia() {
        return (int)(Math.random() * this.nFacce) + 1;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Dado a " + this.nFacce
                + " facce";
    }
}
