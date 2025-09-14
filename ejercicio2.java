
public class ejercicio2 {
    public static void main(String[] args) {
        int numero = 5; // Cambia este valor para probar con otros números
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}