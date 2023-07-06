import java.util.Scanner;

public class JavaDongulerUssu4ve5For {
    public static void main(String[] args) {
        int sayi,i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        sayi = input.nextInt();
        for (i=1;i<=sayi;i*=4) {
            System.out.println("4'ün katları = " + i);
        }
        for (j = 1; j <= sayi; j *= 5) {
            System.out.println("5'in katları " + j);
        }

    }
}
