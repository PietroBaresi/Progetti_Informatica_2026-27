import graphics.Color;
import graphics.Ellipse;

public class Lampadina {
    private double potenza;
    private int illuminazione;
    private String colore;
    private String nome;
    private boolean accesa;

    Ellipse lampada;

    public Lampadina(double potenza, int x, int y) {
        this.potenza = potenza;
        if (this.potenza < 1 || this.potenza > 100) {
            this.potenza = 10;
        }
        this.colore = "bianco";
        this.illuminazione = 100;
        this.accesa = false;
        this.nome = "";
        lampada = new Ellipse(x, y, 50, 50);
        lampada.draw();
    }

    public Lampadina(double potenza) {
        this.potenza = potenza;
        if (this.potenza < 1 || this.potenza > 100) {
            this.potenza = 10;
        }
        this.colore = "bianco";
        this.illuminazione = 100;
        this.accesa = false;
        this.nome = "";
    }

    public Lampadina(Lampadina l) {
        this.potenza = l.potenza;
        this.illuminazione = l.illuminazione;
        this.colore = l.colore;
        this.nome = l.nome;
        this.accesa = l.accesa;
    }

    public String getNome() {

        return nome;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }

    public void accendi(){

        this.accesa = true;
        lampada.setColor(Color.YELLOW);
        lampada.fill();
    }

    public void spegni(){

        this.accesa = false;
        lampada.setColor(Color.BLACK);
        lampada.fill();
    }

    public void aumentaLuminosita(){
        this.illuminazione +=10;
        if (this.illuminazione > 100){
            this.illuminazione = 100;
        }
    }

    public void diminuisciLuminosita(){
        this.illuminazione -=10;
        if (this.illuminazione < 0){
            this.illuminazione = 0;
        }
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + ", Potenza: " + this.potenza + " watt, Stato: " + this.accesa
                            + ", Qta: " + this.illuminazione + "%, Colore: " + this.colore;
    }
}
