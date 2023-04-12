package cadenas;

public class InvarianzaCadenas {

    public static void main(String[] args) {
        String s = "Hola";
        s = "chau";
        System.out.println(s);
//        En general no debe preocuparnos demasiado que, al concatenar cadenas, se creen
//        nuevos objetos y otros queden desreferenciados. Pero sí debemos ser conscientes
//        de esto; sobre todo si en nuestro programa heremos un uso intensivo de este tipo
//        de situaciones. En tal caso debemos usar la clase
//                StringBuilder
//.
    }
}
