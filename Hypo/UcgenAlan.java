package Hypo;

import java.util.Scanner;
import java.lang.Math;

public class UcgenAlan {
    public static void main(String[] args) {
        double a,b,c; // Sonuclar daha net olsun ve eşkenar üçgen formülüne de uysun diye double tanımladım.
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz : ");
        a = input.nextDouble();
        System.out.println("İkinci kenarı giriniz : ");
        b = input.nextDouble();
        System.out.println("Üçüncü kenarı giriniz : ");
        c = input.nextDouble();
        double u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
        System.out.println("Alanı : " + alan);

    }
}
