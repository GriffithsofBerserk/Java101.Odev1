import java.util.Scanner;

public class RecursiveMethodOruntu {
    static void Oruntu(int n){
        System.out.print(n+" ");
        int value = 5;

        if (n <= 0){
            value *= -1;
        } else {
            Oruntu(n - value);
            System.out.print(n+ " ");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        n = input.nextInt();
        System.out.print("Çıktısı : ");
        Oruntu(n);
    }
}
