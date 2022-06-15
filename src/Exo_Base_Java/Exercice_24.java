package Exo_Base_Java;

public class Exercice_24 {

       static boolean isPrefix (String text, String prefix)
    {
        String textPrefix = text.substring(0,prefix.length());

        return textPrefix.equals(prefix);
    }

    public static void main(String[] args)

    {

    String word1 = "banner";
    String word2 = "bang";

    boolean word12 = isPrefix(word1,word2);

    System.out.println(word12);

    }
}

