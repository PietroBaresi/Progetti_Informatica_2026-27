public class Quiz {
    private Domanda[] domande;
    private int totPunteggio;
    private int tuoPunteggio;
    private String titolo;
    private int numeroDomande = 0;
    private final int maxDomande = 100;

    public Quiz(String s) {
        titolo = s;
    }

    public Quiz (Quiz q){
        this.domande = q.domande.clone();
        for (int i = 0; i < domande.length; i++) {
            domande[i] = new Domanda(q.domande[i]);
        }
    }

    public void add (Domanda d){
        if(domande.length < maxDomande){
            domande[numeroDomande] = d;
            numeroDomande ++;
        }
    }

    public int getQuanteDomande() {
        return numeroDomande;
    }

    public int getQuanteRisposte(){
        int a = 0;
        for (int i = 0; i < domande.length; i++) {
            if(domande[i].completata()){
                a ++;
            }
        }
        return a;
    }

    public int[] getDomandeNonDate(){
        int[] a;
        a = new int[maxDomande];
        int b = 0;
        for (int i = 0; i < domande.length; i++) {
            if(!domande[i].completata()){
                a[b] += i;
                b++;
            }
        }
        return a;
    }




}
