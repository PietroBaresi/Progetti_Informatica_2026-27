public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    public void setGradi(int gradi) {
        this.gradi = gradi;
        if(this.gradi > 360){
            this.gradi -= 360;
        }
    }

    public void setPrimi(int primi) {
        this.primi = primi;
        if(this.primi < 0 || this.primi >= 60){
            this.primi = 25;
        }
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
        if(this.secondi < 0 || this.secondi >= 60){
            this.secondi = 30;
        }
    }

    public Angolo sommaAngolo(Angolo b){
        Angolo c = new Angolo();
        c.secondi = this.secondi + b.secondi;
        c.primi = this.primi + b.primi;
        c.gradi = this.gradi + b.gradi;

        if(c.secondi >= 60){
            c.secondi -= 60;
            c.primi += 1;
        }
        if(c.primi >= 60){
            c.primi -= 60;
            c.gradi += 1;
        }
        while(gradi > 360){
            c.gradi -= 360;
        }
        return c;
    }

    public Angolo sottraiAngolo(Angolo b){
        Angolo c = new Angolo();
        int tempSecondi = this.secondi;
        int tempPrimi = this.primi;
        if(tempSecondi < b.secondi){
            tempSecondi += 60;
            tempPrimi --;
        }
        c.secondi = tempSecondi - b.secondi;
        if(tempPrimi < b.primi){
            tempPrimi += 60;
            this.gradi --;
        }
        c.primi = tempPrimi - b.primi;
        c.gradi = this.gradi - b.gradi;
        return c;
    }

    @Override
    public String toString() {
        return "Angolo{" +
                "gradi=" + gradi +
                ", primi=" + primi +
                ", secondi=" + secondi +
                '}';
    }
}
