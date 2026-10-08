public class Incrocio {
    private Semaforo N;
    private Semaforo E;
    private Semaforo S;
    private Semaforo O;

    public Incrocio(){
        this.N = new Semaforo();
        this.S = new Semaforo();
        this.E = new Semaforo();
        this.O = new Semaforo();
    }

    public void accendi (){
        this.N.accendi();
        this.S.accendi();
        this.E.accendi();
        this.O.accendi();

        while (!this.N.getColore().equals("ROSSO")) {
            this.N.avanza();
        }
        while (!this.S.getColore().equals("ROSSO")) {
            this.S.avanza();
        }
        while (!this.E.getColore().equals("VERDE")) {
            this.E.avanza();
        }
        while (!this.O.getColore().equals("VERDE")) {
            this.O.avanza();
        }
    }

    public void spegni() {
        this.N.spegni();
        this.S.spegni();
        this.E.spegni();
        this.O.spegni();
    }

    public void avanza(char strada) {
        boolean bloccoNS = this.N.getColore().equals("GIALLO") &&
                (this.E.getColore().equals("VERDE") || this.E.getColore().equals("GIALLO") ||
                        this.O.getColore().equals("VERDE") || this.O.getColore().equals("GIALLO"));

        boolean bloccoEO = this.E.getColore().equals("GIALLO") &&
                (this.N.getColore().equals("VERDE") || this.N.getColore().equals("GIALLO") ||
                        this.S.getColore().equals("VERDE") || this.S.getColore().equals("GIALLO"));

        switch (strada) {
            case 'N':
                while (!bloccoNS) {
                    this.N.avanza();
                    bloccoNS = true;
                }
                break;
            case 'S':
                while (!bloccoNS) {
                    this.S.avanza();
                    bloccoNS = true;
                }
                break;
            case 'E':
                while (!bloccoEO) {
                    this.E.avanza();
                    bloccoEO = true;
                }
                break;
            case 'O':
                while (!bloccoEO) {
                    this.O.avanza();
                    bloccoEO = true;
                }
                break;
            default:
                break;
        }
    }

    public boolean isAcceso() {
        return this.N.isAcceso() || this.S.isAcceso() || this.E.isAcceso() || this.O.isAcceso();
    }

    public String getColore(char strada){
        String coloreRilevato = "";
        boolean controlloAcceso = this.isAcceso();
        while (controlloAcceso) {
            switch (strada) {
                case 'N': coloreRilevato = this.N.getColore(); break;
                case 'S': coloreRilevato = this.S.getColore(); break;
                case 'E': coloreRilevato = this.E.getColore(); break;
                case 'O': coloreRilevato = this.O.getColore(); break;
                default:  coloreRilevato = ""; break;
            }
            controlloAcceso = false;
        }

        return coloreRilevato;
    }

    @Override
    public String toString() {
        return
                "   |     N    |\n" +
                        "   |          |\n" +
                        "   |  " + N.getColore() + "   |\n" +
                        "---------------------\n" +
                        " " + O.getColore() + "        " + E.getColore() + "\n" +
                        "O                  E\n" +
                        " " + O.getColore() + "        " + E.getColore() + "\n" +
                        "---------------------\n" +
                        "   |  " + S.getColore() + "   |\n" +
                        "   |          |\n" +
                        "   |    S     |\n";
    }

}
