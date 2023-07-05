import java.util.Scanner;

public class DoWhileGirilenCift {
    public static void main(String[] args) {
        int i=0,sayi,sum=0,ort=0,bolen=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        sayi = input.nextInt();
        do {
            i++;
            if (i%3==0 && i%4==0){
                System.out.println(i);
                sum +=i;
                bolen++;
                ort = sum/bolen;
            }
        }while (i<sayi);
        System.out.println("3'e ve 4'e bölünen tam sayıların ortalaması : " + ort);

    }
}
