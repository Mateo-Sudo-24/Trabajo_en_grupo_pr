public class Proyectil {
    private double velocidadInicial;
    private double angulo;

    public Proyectil(double velocidadInicial, double angulo) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
    }

    public double calcularAlturaMaxima() {
        double g = 9.81;
        return (Math.pow(velocidadInicial * Math.sin(angulo), 2)) / (2 * g);
    }

    public double calcularTiempoParaAlturaMaxima() {
        double g = 9.81;
        return (velocidadInicial * Math.sin(angulo)) / g;
    }
}