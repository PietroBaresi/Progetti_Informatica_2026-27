public class Studente {
    private String nome;
    private String cognome;
    private int eta;
    private double altezza;
    private double peso;

    public Studente(String nome, String cognome, int eta, double altezza, double peso){
        this.nome = nome;
        this.cognome=cognome;
        this.eta=eta;
        this.altezza=altezza;
        this.peso = peso;
        if(this.eta <= 0){
            this.eta = 5;
        }
        if(this.altezza <= 0){
            this.altezza = 1.10;
        }
        if(this.peso <= 0){
            this.peso = 30;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public Studente(Studente s){
        this.nome = s.nome;
        this.cognome = s.cognome;
        this.eta = s.eta;
        this.altezza = s.altezza;
        this.peso = s.peso;
    }
    public double calcolaIndice(){
        double BMI = 0;
        BMI = peso / (altezza * altezza);
        return BMI;
    }

    public double mediaEta(Studente s){
        return (this.eta + s.getEta()) / 2.0;
    }

    public double confrontaAltezze(Studente s){
        if(this.altezza > s.getAltezza()){
            return this.altezza;
        }
        return s.getAltezza();
    }
    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", altezza=" + altezza + " m" +
                ", peso=" + peso + " kg" +
                '}';
    }

}
