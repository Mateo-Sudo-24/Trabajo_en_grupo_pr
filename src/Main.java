public class Main {
    public static void main(String[] args) {
        try {
            String velocidadStr = "50"; // Ejemplo de velocidad inicial en m/s
            String anguloStr = "45"; // Ejemplo de ángulo en grados

            double velocidadInicial = Conversiones.convertirVelocidad(velocidadStr);
            double angulo = Conversiones.convertirAngulo(anguloStr);

            Proyectil proyectil = new Proyectil(velocidadInicial, angulo);

            double alturaMaxima = proyectil.calcularAlturaMaxima();
            double tiempoParaAlturaMaxima = proyectil.calcularTiempoParaAlturaMaxima();

            System.out.println("Altura máxima: " + alturaMaxima + " metros");
            System.out.println("Tiempo para alcanzar la altura máxima: " + tiempoParaAlturaMaxima + " segundos");
        } catch (NumberFormatException e) {
            System.out.println("Error en la conversión de datos: " + e.getMessage());
        }
    }
}