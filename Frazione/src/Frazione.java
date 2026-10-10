public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione() {
        this.numeratore = 0;
        this.denominatore = 1;
    }

    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public void setDenominatore(int denominatore) {
        if (denominatore == 0) {
            System.out.println("Errore: Il denominatore non può essere 0. Impostato a 1.");
            this.denominatore = 1;
        } else {
            this.denominatore = denominatore;
        }
    }

    public int mcd() {
        int a = Math.abs(this.numeratore);
        int b = Math.abs(this.denominatore);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void semplificaFrazione(){
        int divisore = mcd();
        if (divisore != 0) {
            this.numeratore = this.numeratore / divisore;
            this.denominatore = this.denominatore / divisore;
        }

        if (this.denominatore < 0) {
            this.numeratore = -this.numeratore;
            this.denominatore = -this.denominatore;
        }
    }

    public Frazione reciprocaFrazione(){
        Frazione nuova = new Frazione();
        nuova.numeratore = this.denominatore;
        nuova.denominatore = this.numeratore;
        nuova.semplificaFrazione();
        return nuova;
    }

    public Frazione oppostaFrazione(){
        Frazione nuova = new Frazione();
        nuova.numeratore = -this.numeratore;
        nuova.denominatore = this.denominatore;
        nuova.semplificaFrazione();
        return nuova;
    }

    public Frazione sommaFrazione (Frazione frazione){
        Frazione nuova = new Frazione();
        nuova.numeratore = (this.numeratore * frazione.denominatore) + (frazione.numeratore * this.denominatore);
        nuova.denominatore = this.denominatore * frazione.denominatore;
        nuova.semplificaFrazione();;
        return nuova;
    }

    public Frazione sottraiFrazione (Frazione frazione){
        Frazione nuova = new Frazione();
        nuova.numeratore = (this.numeratore * frazione.denominatore) - (frazione.numeratore * this.denominatore);
        nuova.denominatore = this.denominatore * frazione.denominatore;
        nuova.semplificaFrazione();;
        return nuova;
    }

    public Frazione moltiplicaFrazione (Frazione frazione){
        Frazione nuova = new Frazione();
        nuova.numeratore = this.numeratore * frazione.numeratore;
        nuova.denominatore = this.denominatore * frazione.denominatore;
        nuova.semplificaFrazione();;
        return nuova;
    }

    public Frazione dividiFrazione (Frazione frazione){
        Frazione nuova = new Frazione();
        nuova.numeratore = this.numeratore * frazione.denominatore;
        nuova.denominatore = this.denominatore * frazione.numeratore;
        nuova.semplificaFrazione();;
        return nuova;
    }

    public Frazione elevaFrazione(int potenza){
        Frazione nuova = new Frazione();
        for (int i = 0; i < potenza; i++) {
            nuova.numeratore = this.numeratore * this.numeratore;
            nuova.denominatore = this.denominatore * this.denominatore;
        }
        nuova.semplificaFrazione();;
        return nuova;
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
}