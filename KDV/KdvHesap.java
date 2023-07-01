package KDV;

import java.util.Scanner;
import java.util.Locale;

public class KdvHesap {
    public static void main(String[] args) {
        double kdv;
        System.out.println("KDV'sini hesaplamak istediğiniz sayıyı giriniz : ");
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        kdv = input.nextDouble();
        if (0<kdv && kdv<=1000){
            double kdvtutari = 0.18; // direkt 1.18 ile sayı çarpıldığında toplamaya gerek kalmadan kdvli tutar çıktığı için 1.18 yazdım.
            double toplam = (kdvtutari*kdv)+kdv;
            System.out.println("KDV'li tutar : " + toplam);
            System.out.println("KDV Tutarı : " + kdvtutari);
            double fark = toplam-kdv;
            System.out.println("KDV'li tutar ile KDV'siz tutar arasındaki fark : " + fark);
        }else if (kdv>1000) {
                double kdvtutari = 0.08;
                double toplam = (kdvtutari*kdv)+kdv;
                System.out.println("KDV'li tutar : " + toplam);
                System.out.println("KDV Tutarı : " + kdvtutari);
                double fark = toplam-kdv;
                System.out.println("KDV'li tutar ile KDV'siz tutar arasındaki fark : " + fark);
        }

    }
}
