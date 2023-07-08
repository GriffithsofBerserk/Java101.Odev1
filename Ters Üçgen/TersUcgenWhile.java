import java.util.Scanner;
public class TersUcgenWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz : ");
        int sayi = input.nextInt();
        int i = sayi,a,k;
        while (i > 0) {
            a = 0;
            while (a++ < sayi - i) {
                System.out.print(" ");
            }
            k = 0;
            while (k++ < (2*i) - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}