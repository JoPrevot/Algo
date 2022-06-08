public class Exercice_4 {
    public static void main(String[] args) {

        short a = 51;
        short b = 876;
        short c = 235;

        System.out.println("Les valeurs entrees sont : " +"a = " +a +", b= " +b +" et c = " +c +".");

        short tmp = a;

        a = c;
        c = b;
        b = tmp;

        System.out.println("Les valeurs permutees sont : " +"a = " +a +", b= " +b +" et c = " +c +".");

    }
}
