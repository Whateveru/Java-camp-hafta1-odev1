public class Main {
    public static void main(String[] args) {
        //For//
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        //while//

        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while döngüsü bitti");

        //Do-While//

        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
        System.out.println("Do-While dögüsü bitti");


    }
}