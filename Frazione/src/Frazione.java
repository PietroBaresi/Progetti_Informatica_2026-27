public class Frazione {
    private int numeratore;
    private int denominatore;

    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
    }

    public int mcd() {
        while (this.denominatore != 0) {
            int temp = this.denominatore;
            this.denominatore = this.numeratore % temp;
            this.numeratore = temp;
        }
        if (this.numeratore < 0){
            this.numeratore -= this.numeratore;
        }
        return this.numeratore;
    }

    public void semplificaFrazione(){
        this.numeratore = this.numeratore / mcd();
        this.denominatore = this.denominatore / mcd();
    }

    public void reciprocaFrazione(){
        this.numeratore = this.denominatore;
        this.denominatore = this.numeratore;
    }

    public void oppostaFrazione(){
        this.numeratore = - this.numeratore;
    }

    public void sommaFrazione (Frazione frazione){
        this.numeratore = (this.numeratore * frazione.denominatore) + (frazione.numeratore * this.denominatore);
        this.denominatore = this.denominatore * frazione.denominatore;
        semplificaFrazione();
    }

    public void sottraiFrazione (Frazione frazione){
        this.numeratore = (this.numeratore * frazione.denominatore) - (frazione.numeratore * this.denominatore);
        this.denominatore = this.denominatore * frazione.denominatore;
        semplificaFrazione();
    }

    public void moltiplicaFrazione (Frazione frazione){
        this.numeratore = this.numeratore * frazione.numeratore;
        this.denominatore = this.denominatore * frazione.denominatore;
        semplificaFrazione();
    }

    public void dividiFrazione (Frazione frazione){
        this.numeratore = this.numeratore * frazione.denominatore;
        this.denominatore = this.denominatore * frazione.numeratore;
        semplificaFrazione();
    }

    public void elevaFrazione(int potenza){
        for (int i = 0; i < potenza; i++) {
            this.numeratore = this.numeratore * this.numeratore;
            this.denominatore = this.denominatore * this.denominatore;
        }
        semplificaFrazione();
    }

    @Override
    public String toString() {
        return "Frazione{" +
                "numeratore=" + numeratore +
                ", denominatore=" + denominatore +
                '}';
    }
}
