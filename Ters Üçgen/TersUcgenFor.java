import java.util.Scanner;

public class TersUcgenFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını girin : ");
        int bas = input.nextInt();
        for (int i=bas;i>0;i--) {
            for (int a = 0; a < bas - i; a++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
