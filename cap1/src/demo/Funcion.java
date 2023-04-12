package demo;

public class Funcion {

    //    calcular el factorial de n
    public static double factorial(int n){
        double r = 1;
        for (int i = 2; i <= n; i++) {
            r*=i;
        }
        return r;
    }


    //    Determinar si n es un numero primo o no
    public static boolean esPrimo(int n){
        int i =2;
        while (n%i != 0 && i<n){
            i++;
        }
        return i==n;
    }


}
