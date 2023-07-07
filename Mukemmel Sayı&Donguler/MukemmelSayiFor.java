import java.util.Scanner;

public class MukemmelSayiFor {
    public static void main(String[] args) {
        int sayi, i, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        sayi = input.nextInt();
        String muk = " bir mükemmel sayı değildir.";
        if (sayi <= 1) {
            System.out.println(sayi+muk);
        } else {
            for (i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    sum += i;
                }
            }
            if (sayi == sum) {
                System.out.println(sayi + " bir mükemmel sayıdır.");
            } else if (sayi != sum) {
                System.out.println(sayi + muk);
            }
        }
    }
}
