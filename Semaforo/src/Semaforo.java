public class Semaforo {
    private String stato;
    private String colore;

    public Semaforo(){
        this.stato = "spento";
    }

    public void accendi(){
        this.stato = "acceso";
        this.colore = "VERDE";
    }

    public void spegni(){
        this.stato = "acceso";
    }

    public void toggle(){
        if(this.stato.equals("acceso")){
            this.stato = "spento";
        }else {
            this.stato = "acceso";
        }
    }

    public void avanza(){
        if(this.colore.equals("GIALLO")){
            this.colore = "VERDE";
        }else if (this.colore.equals("VERDE")){
            this.colore = "ROSSO";
        }else{
            this.colore = "GIALLO";
        }
    }

    public boolean isAcceso(){
        if(this.stato.equals("acceso")){
            return true;
        }
        return false;
    }

    public String getColore() {
        if(this.stato.equals("spento")){
            return "";
        }
        return colore;
    }

    @Override
    public String toString(){
        if(this.stato.equals("spento")) {
            return "Il semaforo è " + this.stato;
        }
        return "Il semaforo è " + this.stato +
                " sul " + this.colore;
    }
}
