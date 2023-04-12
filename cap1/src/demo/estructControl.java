package demo;

import java.util.Scanner;

public class estructControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // El usuario ingresa su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Mostramos un mensaje segun sea mayor de 18 o no
        String mssg = (edad >= 18) ? "Bienvenido" : "Debe ser mayor de 18";
        System.out.print(mssg);

        scanner.close();
    }
}
