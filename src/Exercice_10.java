public class Exercice_10 {
    public static void main(String[] args) {

        System.out.println("Table de multiplication");

        for(int i = 2 ; i <= 10 ; i++)
        {
            System.out.println(" ");
            System.out.printf("Table de %d \n", i);
            System.out.println(" ");

            for(int j = 1; j <= 10 ; j++)
            {
                System.out.printf("%d X %d = %d \n",i,j,(i * j));

            }
        }
    }
}
