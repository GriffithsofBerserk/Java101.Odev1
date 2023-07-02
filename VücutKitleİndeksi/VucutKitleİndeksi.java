import java.util.Scanner;

public class VucutKitleİndeksi {
    public static void main(String[] args) {
        double boy,kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu m cinsinden giriniz : ");
        boy = input.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz : ");
        kilo = input.nextDouble();
        double index = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + index);
    }
}
