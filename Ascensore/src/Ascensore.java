public class Ascensore {
    private int totPiani;
    private int piano;
    private String porte;

    public Ascensore(int totPiani){
        if(totPiani < 2){
            this.totPiani = 2;
        }else{
            this.totPiani = totPiani;
        }
        this.piano = 0;
        porte = "chiuse";
    }

    public int getPiano() {
        return piano;
    }

    public int getTotPiani() {
        return totPiani;
    }

    public void apri(){
        this.porte = "aperte";
    }

    public void chiudi(){
        this.porte = "chiuse";
    }

    public boolean sali(){
        if(this.porte.equals("aperte") && this.piano == this.totPiani){
            return false;
        }
        this.piano ++;
        return true;
    }

    public boolean scendi(){
        if(this.porte.equals("aperte") && this.piano == 0){
            return false;
        }
        this.piano --;
        return true;
    }

    public boolean vaiAlPiano(int nPiano){
        if((nPiano < 0 || nPiano > this.totPiani) && this.porte.equals("aperte")){
            return false;
        }
        this.piano = nPiano;
        return true;
    }

    @Override
    public String toString() {
        return "L'ascensore serve " + totPiani +
                " piani, attualmente è al " + piano +
                " piano e le porte sono " + porte;
    }
}
