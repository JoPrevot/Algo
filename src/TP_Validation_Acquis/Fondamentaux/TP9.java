package TP_Validation_Acquis.Fondamentaux;

public class TP9 {

     public static boolean maMethode(String text) {
         boolean check = true;

         while (true)
         {
             for (int i = 0; i < text.length() - 1; i++)
             {
                 if (!(text.charAt(i) == text.charAt(i + 1))) {
                     check = false;
                 }
                 else if (text.charAt(i) == text.charAt(i + 1)) {
                     check = true;
                     break;
                 }
             }
             return check;
         }
     }

    public static void main(String[] args) {

         var text = "terrific";

         boolean newText = maMethode(text);

         System.out.println(newText);

    }
}
