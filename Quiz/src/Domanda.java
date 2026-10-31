public class Domanda {
    private String testo;
    private int valore;
    private Risposta[] risposta;
    private int rispostaData;

    public Domanda(String t, Risposta[] r){
        this.testo = t;
        this.risposta = new Risposta[4];
        this.risposta = r.clone();
        this.valore = 1;
    }

    public Domanda(Domanda d){
        this.valore = d.valore;
        this.testo = d.testo;
        this.rispostaData = -1;
        this.risposta = d.risposta.clone();
    }

    public boolean rispondi(int r){
        if(this.risposta[r].isCorretta()){
            this.rispostaData = r;
            return true;
        }
        this.rispostaData = r;
        return false;
    }

    public void setValore(int valore) {
        if(this.valore > 0){
            this.valore = valore;
        }
    }

    public int getValore() {
        return valore;
    }

    public boolean completata(){
        if(rispostaData != -1){
            return true;
        }
        return false;
    }

    public int getPunteggio(){
        if(rispondi(rispostaData)){
            return valore;
        }
        else if(!completata()){
            return -1;
        }
        return 0;
    }

    public String getRispostaCorretta() {
        for(int i = 0; i < risposta.length; i++){
            if(risposta[i].isCorretta()){
                return risposta[i].getTestoRisposta();
            }
        }
        return "Nessuna risposta corretta";
    }

    public String getRispostaData() {
        return risposta[rispostaData].getTestoRisposta();
    }

    @Override
    public String toString(){
        String s =  testo + "\n";
        for (int i = 0; i < risposta.length; i++) {
            s += risposta[i].getTestoRisposta() + "\n";
        }
        return s;
    }
}
