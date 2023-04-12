package demo;

public class autoboxing {
    public static void main(String[] args) {
        Integer i = new Integer(1234);
        //    conversion automatica entre Wappers Integer a int
        int j = i;
        System.out.println(j);

        int n = new Integer(567);
        System.out.println(n);

        Integer k = null;
        if (k != null) {
            System.out.printf("Bienvenidos al cuento de lac cripta ");
        }else{
            System.out.println("EL VALOR INICIAL ES NULL");
        }
    }
}

