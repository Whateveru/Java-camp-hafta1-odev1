public class Main {
    public static void main(String[] args) {
        int[] sayılar = new int[]{1,2,5,7,9,0};
        int aranacak =1;
        boolean varmı = false;

        for (int sayi : sayılar){
            if (sayi == aranacak){
                varmı = true;
                break;
            }
        }
        if (varmı){
            System.out.println("sayı mevcuttur");
        }else{
            System.out.println("sayı mevcut değildir");
        }


    }
}