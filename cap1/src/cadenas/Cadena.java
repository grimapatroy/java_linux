package cadenas;

public class Cadena {
    public static void main(String[] args) {

        String s = "HOLA como estas";
        String x = "HOLA";
        String y = "HOLA";
        String a = "";
        System.out.println(s.length());
        System.out.println(a.isEmpty());
        System.out.println(s.isEmpty());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }

        if (x.equals(y)){
            System.out.println("Si pasa por aqui");
        }

        int p1 = s.indexOf('a');
        int p2 = s.lastIndexOf('a');

        // enteros
        String s1 = "1234";
        int i = Integer.parseInt(s1);
         // retorna: 1234
        String t1 = Integer.toString(i);
        // retorna: "1234"
        // flotantes
        String s2 = "1234.56";
        double d = Double.parseDouble(s2);
        // retorna: 1234.56
        String t2 = Double.toString(d);
        // retorna: "1234.56"


    }
}
