
import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random ramdon = new Random();
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int numeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
}
