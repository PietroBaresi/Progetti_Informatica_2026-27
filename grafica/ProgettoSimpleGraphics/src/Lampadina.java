import graphics.Color;
import graphics.Ellipse;
import graphics.Text;

public class Lampadina {
    private double potenza;
    private int illuminazione;
    private String colore;
    private String nome;
    private boolean accesa;
    private Ellipse lampada;
    private Text testoNome;

    public Lampadina(double potenza, int x, int y) {
        this.potenza = (potenza < 1 || potenza > 100) ? 10 : potenza;
        this.colore = "giallo";
        this.illuminazione = 100;
        this.accesa = false;
        this.nome = "";

        this.lampada = new Ellipse(x, y, 50, 50);
        this.lampada.draw();
    }


    public Lampadina(Lampadina l) {
        this(l.potenza, (l.lampada != null ? l.lampada.getX() + 70 : 50), (l.lampada != null ? l.lampada.getY() : 50));
        this.illuminazione = l.illuminazione;
        this.colore = l.colore;
        setNome(l.nome);
        if (l.accesa) {
            accendi();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        if (testoNome != null) {
            Text t = new Text(lampada.getX(), lampada.getY() + 60, nome);
            t.draw();
        }
    }

    public void accendi() {
        this.accesa = true;
        aggiornaColore();
    }

    public void spegni() {
        this.accesa = false;
        aggiornaColore();
    }

    public void aumentaLuminosita(int valore) {
        this.illuminazione = Math.min(100, this.illuminazione + valore);
        aggiornaColore();
    }

    public void diminuisciLuminosita(int valore) {
        this.illuminazione = Math.max(0, this.illuminazione - valore);
        aggiornaColore();
    }

    public void aggiornaColore() {
        if (lampada == null) return;

        if (!this.accesa) {
            lampada.setColor(Color.BLACK);
        } else {
            // Regola la tonalità di giallo in base alla luminosità (0-100%)
            int intensita = (int) (255 * (this.illuminazione / 100.0));
            lampada.setColor(new Color(intensita, intensita, 0));
        }
        lampada.fill();
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Potenza: " + this.potenza + " watt, Stato: " + this.accesa + ", Qta: " + this.illuminazione + "%, Colore: " + this.colore;
    }
}
