package Taksimetre;
import java.util.Scanner;
public class Taksi {
    public static void main(String[] args) {
        int km,BaslangicUcreti = 10;
        double total,perKm = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km gittiğinizi girin : ");
        km = input.nextInt();
        total = perKm*km;
        total += BaslangicUcreti;
        total = (total < 20) ? 20 : total;
        System.out.println("Taksimetre tutarı :  " + total);
    }
}
