public class ContoCorrente {
    private String cognome;
    private String nome;
    private String codice;
    private double saldo;

    //Costruttore
    public ContoCorrente(String cognome, String nome, String codice) {
        this.cognome = cognome;
        this.nome = nome;
        this.codice = codice;
        this.saldo = 0.0;
    }

    //metodo preleva
    public double preleva(double soldi) {
        if (saldo > 0 && (this.saldo - soldi) > 0) {
            this.saldo -= soldi;
        }
        return this.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCodice() {
        return codice;
    }

    public String getNominativo() {
        return this.nome + this.cognome;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "cognome='" + cognome + ' ' +
                ", nome='" + nome + ' ' +
                ", codice='" + codice + ' ' +
                ", saldo=" + saldo +
                '}';
    }
}
