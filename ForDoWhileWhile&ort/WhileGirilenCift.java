import java.util.Scanner;

public class WhileGirilenCift {
    public static void main(String[] args) {
        int a=0,sayi,sum=0;
        double ort=0;
        double bolen=0;
        System.out.println("Bir sayı giriniz : ");
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        while (a<sayi){
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
