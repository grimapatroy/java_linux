package demo;
import java.util.Scanner;

public class intOutput {
    public static void main(String[] args) {
        // Preparamos para leer por teclado
        Scanner scanner = new Scanner(System.in);

        // El usuario ingresa su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // HolaMundo personalizado
        System.out.println("Hola Mundo, "+nombre);

        // Ingresamos un int por teclado
        int n = scanner.nextInt();

        // Ingresamos un double por teclado
        double d = scanner.nextDouble();

        // Ingresamos un String por teclado
        String s = scanner.next();

        // Cerramos el scanner
        scanner.close();
    }
}