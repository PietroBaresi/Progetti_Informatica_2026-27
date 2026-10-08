public class Punto {
    private double x;
    private double y;

    public Punto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }

    public double distanza(Punto p){
        return Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
    }

    public Punto medio(Punto p){
        Punto medio = new Punto();
        medio.x = p.x + this.x;
        medio.y = p.y + this.y;
        return medio;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
