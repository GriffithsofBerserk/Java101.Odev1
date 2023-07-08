import java.util.Scanner;

public class TersUcgenDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz : ");
        int sayi = input.nextInt();
        int i = sayi,a,k;
        do{
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
        }while (i>0);
    }
}
