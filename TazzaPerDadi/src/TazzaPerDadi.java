public class TazzaPerDadi {
    private int totDadi;
    Dado[] dadi;
    private int nDadi;
    private boolean automatica;

    public TazzaPerDadi(int N){
        this.totDadi = N;
        this.dadi = new Dado[this.totDadi];
    }

    public TazzaPerDadi(int N, int F){
        this.nDadi = N;
        this.dadi = new Dado[this.nDadi];
        for (int i = 0; i < N; i++) {
            this.dadi[i] = new Dado(F);
        }
        automatica = true;
    }

    public boolean add(int F){
        if(this.dadi.length == nDadi){
            return false;
        }
        this.dadi[nDadi] = new Dado (F);
        nDadi ++;
        return true;
    }

    public int quanti(){
        return nDadi;
    }

    public int size(){
        return totDadi;
    }


    public int lancia(){
        int somma = 0;
        for (int i = 0; i < this.nDadi; i++) {
            somma += this.dadi[i].lancia();
        }
        return somma;
    }

    public boolean isEmpty(){
        if(this.nDadi > 0){
            return false;
        }
        return true;
    }

    public int getMinimo(){
        return this.nDadi;
    }

    public int getMassimo(){
        //Questa formula funziona solo se i dadi hanno tutti lo stesso numero di facce
        //return this.nDadi * this.dadi[0].getFacce();
        int massimo = 0;
        for (int i = 0; i < this.nDadi; i++) {
            massimo += this.dadi[i].getFacce();
        }
        return massimo;
    }

    @Override
    public String toString(){
        String s;
        if(!automatica) {
            s = "Questa tazza può contenere al massimo " + this.totDadi + " dadi. \n";
            s += "Dadi attualmente contenuti: " + this.nDadi + "\n";
            s += "Lista dei dadi: \n";
            for (int i = 0; i < this.nDadi; i++) {
                s += "- dado da " + this.dadi[i].getFacce() + "\n";
            }
            return s;
        }
        return "Questa tazza contiene esattamente " + this.totDadi + " dadi, tutti con " + this.dadi[0].getFacce();
    }
}
