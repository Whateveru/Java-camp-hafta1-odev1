public class Main {
    public static void main(String[] args) {

        int number1 = 115;
        int number2 = 11111;
        int number3 = 561265;

        int biggest = number1;

        if(biggest<number2) {
            biggest = number2;
        }

        if(biggest<number3){
            biggest = number3;
        }
        System.out.println("Biggest = "+biggest);



    }
}