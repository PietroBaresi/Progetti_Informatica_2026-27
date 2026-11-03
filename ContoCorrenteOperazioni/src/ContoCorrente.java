public class ContoCorrente {
    private String cognome;
    private String nome;
    private String codice;
    private double saldo;
    private Operazioni[] op;
    final int MAX_OPERAZIONI = 1000;

    //Costruttore
    public ContoCorrente(String cognome, String nome, String codice) {
        this.cognome = cognome;
        this.nome = nome;
        this.codice = codice;
        this.saldo = 0.0;
        op = new Operazioni[MAX_OPERAZIONI];
    }
//
//    //metodo preleva
//    public double preleva(double soldi) {
//        if (saldo > 0 && (this.saldo - soldi) >= 0) {
//            this.saldo -= soldi;
//        }
//        return this.saldo;
//    }
//
//    //metodo deposita
//    public double deposita(double soldi){
//        if (soldi > 0){
//            this.saldo += soldi;
//        }
//        return this.saldo;
//    }
//
//    public double getSaldo() {
//        return saldo;
//    }
//
//    public String getCodice() {
//        return codice;
//    }
//
//    public String getNominativo() {
//        return this.nome + " " + this.cognome;
//    }
//
//    @Override
//    public String toString() {
//        return "ContoCorrente{" +
//                "nome='" + cognome + ' ' +
//                ", cognome='" + nome + ' ' +
//                ", codice='" + codice + ' ' +
//                ", saldo=" + saldo +
//                '}';
//    }
    public void eseguiOperazioni(Operazioni o){
        int contatore = 0;
        this.op[contatore] = o;
        if(o.isDeposito()){
            this.saldo += o.getImporto();
        }else{
            if(this.saldo - o.getImporto() > 0){
                this.saldo -= o.getImporto();
            }
        }
        contatore ++;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCodice() {
        return codice;
    }

    public String getNominativo(){
        return nome + " " + cognome;
    }

    public Operazioni getOperazione(int indice){
        if (indice <) {
            return op[indice];
        }
    }
}