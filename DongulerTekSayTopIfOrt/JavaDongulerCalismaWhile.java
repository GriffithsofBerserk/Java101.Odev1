import java.util.Scanner;

public class JavaDongulerCalismaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inp=0,sum=0;
        while (inp<=0 || inp>0){
            System.out.println("Negatif ya da pozitif bir tam sayı giriniz : ");
            inp = input.nextInt();
            if (inp%2!=0){
                System.out.println("Tek sayı girdiniz ve döngüden çıkıldı!");
                break;
            }
            if (inp%2==0 && inp%4==0){
                sum +=inp;
            }
        }
        System.out.println("Girilen değerlerden hem çift ve hem de dördün katlarından olan sayıların toplamları : "+sum);
    }
}
