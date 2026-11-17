import graphics.Color;
import graphics.Ellipse;
import graphics.Text;

public class Lampadina {
    private double potenza;
    private int illuminazione;
    private String colore;
    private String nome;
    private boolean accesa;
    private Color coloreBase;

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
        Text t = new Text(lampada.getX(), lampada.getY() + 60, nome);
        t.draw();
    }

    public void setColore(String colore) {
        this.colore = colore.toLowerCase();
        Color nuovoColore;
        switch (this.colore){
            case "rosso":
                nuovoColore = Color.RED;
                break;
            case "verde":
                nuovoColore = Color.GREEN;
                break;
            case "blu":
                nuovoColore = Color.BLUE;
                break;
            case "rosa":
                nuovoColore = Color.PINK;
                break;
            case "arancione":
                nuovoColore = Color.ORANGE;
                break;
            case "magenta":
                nuovoColore = Color.MAGENTA;
                break;
            default:
                nuovoColore = Color.YELLOW;
        }
        aggiornaColore();
    }

    public void accendi(){
        this.accesa = true;
        setColore(this.colore);
    }

    public void spegni(){

        this.accesa = false;
        lampada.setColor(Color.BLACK);
        lampada.fill();
    }

    public void aumentaLuminosita(int illuminazione){
        this.illuminazione += illuminazione;
        if (this.illuminazione > 100){
            this.illuminazione = 100;
        }
        aggiornaColore();
    }

    public void diminuisciLuminosita(int illuminazione){
        this.illuminazione -= illuminazione;
        if (this.illuminazione < 0){
            this.illuminazione = 0;
        }
        aggiornaColore();
    }

    public void aggiornaColore() {
        if (lampada == null || !this.accesa) {
            return;
        }

        int r = coloreBase.getRed();
        int g = coloreBase.getGreen();
        int b = coloreBase.getBlue();

        // Più illuminazione sale verso 100, più il colore si avvicina al bianco (255, 255, 255)
        double fattore = this.illuminazione / 100.0;

        int nuovoR = (int) (r + (255 - r) * fattore);
        int nuovoG = (int) (g + (255 - g) * fattore);
        int nuovoB = (int) (b + (255 - b) * fattore);

        lampada.setColor(new Color(nuovoR, nuovoG, nuovoB));
        lampada.fill();
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + ", Potenza: " + this.potenza + " watt, Stato: " + this.accesa
                            + ", Qta: " + this.illuminazione + "%, Colore: " + this.colore;
    }
}
