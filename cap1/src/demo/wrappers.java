package demo;

public class wrappers {
    public static void main(String[] args) {
        int i = 123456;

        String a = Integer.toString(i);
        System.out.println(a); // SALIDA: 1234

        String b = Integer.toBinaryString(i);
        System.out.println(i); // SALIDA: 10011010010

        String c = Integer.toHexString(i);
        System.out.println(c); // SALIDA: 4D2

        String d = "12345";
        int j = Integer.parseInt(d);
        System.out.println(d);

    }
}
