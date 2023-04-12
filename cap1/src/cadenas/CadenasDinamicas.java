package cadenas;

public class CadenasDinamicas {

     public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();
         sb.append("Hola, esta es la tecnica Pomodoro, ");
         sb.append("Chau");
         System.out.println(sb);
         sb.setCharAt(2,'X');
         System.out.println(sb);
     }
}
