import java.util.Scanner;

public class ForGirilenCift {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz : ");
        int sum=0,ort=0,bolen=0;
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        for (int a=0;a < sayi;) {
            a++;
            if (a%3==0 && a%4==0){
                System.out.println(a);
                sum +=a;
                bolen++;
                ort = sum/bolen;
            }
        }
        System.out.println("3'e ve 4'e bölünen tam sayıların ortalaması : " + ort);
    }
}
