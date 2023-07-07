import java.util.Scanner;

public class MukemmelSayiWhile {
    public static void main(String[] args) {
        int sayi, i=1, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        sayi = input.nextInt();
        String muk = " bir mükemmel sayı değildir.";
        if (sayi <= 1) {
            System.out.println(sayi+muk);
        } else {
            while (i<sayi){
                if (sayi % i == 0) {
                    sum += i;
                }
            i++;
            }
            if (sayi == sum) {
                System.out.println(sayi + " bir mükemmel sayıdır.");
            } else if (sayi != sum) {
                System.out.println(sayi + muk);
            }
        }
    }
}
