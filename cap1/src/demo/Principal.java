package demo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor: ");
        int n = scanner.nextInt();

//        calculamos el factorial del numero ingresado
//        es una buena pratica ya que es un metodo statico
        double f = Funcion.factorial(n);
//        double z = factorial(n);
        System.out.println("Factorial de "+n+" es :"+f);

        boolean p = Funcion.esPrimo(n);
//        boolean o = esPrimo(n);

        String mssg = p?"es ":" no es";
        System.out.println("El numero "+n+" "+mssg+" primo");

        scanner.close();
    }
}
