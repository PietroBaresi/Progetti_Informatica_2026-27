package it.scuola.esercizi;

import java.time.*;
import java.time.format.DateTimeFormatter;

class Azione {
    private String descrizione;
    private int livello;
    private Instant momento;

    public Azione(String descrizione, int livello) {
        if (livello >= 1 && livello <= 5) {
            this.livello = livello;
        } else {
            this.livello = 1;
        }
        this.descrizione = descrizione;
        this.momento = Instant.now();
    }

    public int getLivello() {
        return livello;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Instant getMomento() {
        return momento;
    }

    private String getTestoLivello() {
        switch (livello) {
            case 1: return "nessun problema";
            case 2: return "annotazione";
            case 3: return "evento moderato";
            case 4: return "evento grave";
            case 5: return "evento critico";
            default: return "";
        }
    }

    @Override
    public String toString() {
        return "Descrizione: " + descrizione + "\n" + momento + " " + getTestoLivello();
    }
}

public class Logger {
    private Azione[] azioni;
    private int nAzioni;

    public Logger(int max) {
        azioni = new Azione[max];
        nAzioni = 0;
    }

    public boolean add(Azione a) {
        if (nAzioni >= azioni.length) {
            return false;
        }
        azioni[nAzioni] = a;
        nAzioni++;
        return true;
    }

    public Azione get(int indice) {
        if (indice < 0 || indice >= nAzioni) {
            return null;
        }
        return azioni[indice];
    }

    public Azione[] getByAttenzione(int livello) {
        if (livello < 1 || livello > 5) {
            return new Azione[0];
        }

        int cont = 0;
        for (int i = 0; i < nAzioni; i++) {
            if (azioni[i].getLivello() == livello) {
                cont++;
            }
        }

        Azione[] a = new Azione[cont];
        int indice = 0;
        for (int i = 0; i < nAzioni; i++) {
            if (azioni[i].getLivello() == livello) {
                a[indice] = azioni[i];
                indice++;
            }
        }
        return a;
    }

    public int size() {
        return nAzioni;
    }

    public boolean isEmpty() {
        return nAzioni == 0;
    }

    @Override
    public String toString() {
        LocalDate i = LocalDate.from(this.get(0).getMomento());
        LocalDateTime inizio = LocalDateTime.from(this.get(0).getMomento());
        LocalDate dataFine = LocalDate.from(this.get(azioni.length - 1).getMomento());
        LocalTime fine = LocalTime.from(this.get(azioni.length - 1).getMomento());
        if (this.isEmpty())
            return "numero totale di azioni: " + nAzioni;
        return "numero totale di azioni: " + nAzioni + "\nLivello 1 : " + getByAttenzione(1).length + "\nLivello 2 : " + getByAttenzione(2).length + "\nLivello 3 : " + getByAttenzione(3).length + "\nLivello 4 : " + getByAttenzione(4).length + "\nLivello 5 : " + getByAttenzione(5).length + "\nLe azioni sono state memorizzate a partire dalle " +
                inizio.getHour() + ":" + inizio.getMinute() + ":" + inizio.getSecond() + " del " + i + " UTC \nfino alle ore " + fine + " del " + dataFine + " UTC";
    }
}
