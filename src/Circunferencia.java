public class Circunferencia {
    public double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2) ;
    }

    public double circunferencia() {
        return 2 * Math.PI * raio;
    }
}
