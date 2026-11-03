import java.time.LocalDateTime;

public class Operazioni {
    private String causale;
    private double importo;
    private boolean prelievo;

    public Operazioni(String causale, double importo, int operazione){
        this.causale = causale;
        this.importo = importo;
        if (operazione != 1)
        {prelievo = false;
        }
        else{
            prelievo = true;
        }
        LocalDateTime momento = LocalDateTime.now();
    }

    public String getCausale() {
        return causale;
    }

    public double getImporto() {
        return importo;
    }

    public LocalDateTime getMomento(){
        return LocalDateTime.now();
    }

    public boolean isPrelievo() {
        return prelievo;
    }

    public boolean isDeposito() {
        return !prelievo;
    }

    @Override
    public String toString() {
        if(prelievo){
            return "Prelievo di " + importo + " , effettuato il " + getMomento() + ", con la seguente causale: \n" + causale;
        }
        return "Deposito di " + importo + " , effettuato il " + getMomento() + ", con la seguente causale: \n" + causale;
    }
}
