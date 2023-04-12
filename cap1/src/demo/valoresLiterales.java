package demo;

import java.math.BigDecimal;

public class valoresLiterales {
    public static void main(String[] args) {
//        literal de tipo char
        char c = 'A';

//        literal de tipo int
        int i = 123;

//        literal de tipo boolen(true o false)
        boolean b = true;

//        literal de tipo double
        double  d = 3.14;

//        literal de tipo String
        String s = "Hola";

        float   f = 3.16f;
//        En  la  práctica resulta poco  frecuente  usar  el  tipo
//        float Incluso,  como  el  tipo double suele presentar problemas  de  aproximación,  los  programadores  con
//        experiencia utilizan, en su lugar, la clase BigDecimal

        BigDecimal k = new BigDecimal(12.12);
        System.out.println(k);
    }
}
