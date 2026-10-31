public class Risposta {
    private String testoRisposta;
    private int indice;
    private boolean corretta;

    public boolean isCorretta() {
        return corretta;
    }

    public String getTestoRisposta() {
        return indice + ") " + testoRisposta;
    }
}
