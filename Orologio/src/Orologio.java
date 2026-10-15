public class Orologio {
    private int oreSveglia;
    private int minutiSveglia;
    private int oreOrario;
    private int minutiOrario;
    private String stato;

    public Orologio(){
        this.oreSveglia = 0;
        this.minutiSveglia = 0;
        this.oreOrario = 0;
        this.minutiOrario = 0;
        this.stato = "normale";
    }

    public Orologio(int ore, int minuti){
        if(ore >= 0 && ore < 24){
            this.oreOrario = ore;
        }else{
            this.oreOrario = 0;
        }
        if(minuti >= 0 && minuti < 60){
            this.minutiOrario = minuti;
        }else{
            this.minutiOrario = 0;
        }
        this.oreSveglia = 0;
        this.minutiSveglia = 0;
        this.stato = "normale";
    }

    public void impostaOrario(){
        if(this.stato.equals("imposta orario")){
            this.stato = "normale";
        }else{
            this.stato = "imposta orario";
        }
    }

    public void impostaSveglia(){
        if(this.stato.equals("imposta sveglia")){
            this.stato = "normale";
        }else{
            this.stato = "imposta sveglia";
        }
    }

    public void setOre(int ore){
        if(this.stato.equals("imposta sveglia")){
            this.oreSveglia = ore;
        }
        else if (this.stato.equals("imposta orario")){
            this.oreOrario = ore;
        }
    }

    public void setMinuti(int minuti){
        if(this.stato.equals("imposta sveglia")){
            this.minutiSveglia = minuti;
        }
        else if (this.stato.equals("imposta orario")){
            this.minutiOrario = minuti;
        }
    }
}
