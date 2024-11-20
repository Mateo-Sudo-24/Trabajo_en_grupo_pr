public class Conversiones {
    public static double convertirVelocidad(String velocidad) throws NumberFormatException {
        return Double.parseDouble(velocidad);
    }

    public static double convertirAngulo(String angulo) throws NumberFormatException {
        return Math.toRadians(Double.parseDouble(angulo));
    }
}