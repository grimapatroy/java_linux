package demo;

public class InferenciaTipos {
    public static void main(String[] args) {
        var a = 5;      //a es int
        var b = 3;      // b es int
        var c = a+b ;   //c es int

        System.out.println(c);

        var s = a +"+"+b+"="+c;     // s es string
        System.out.println(s);
    }
}
