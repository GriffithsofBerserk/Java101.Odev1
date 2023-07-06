import java.util.Scanner;

public class JavaDongulerUssu4ve5While {
    public static void main(String[] args) {
        int sayi,i=1,j=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        sayi = input.nextInt();
        while (i<=sayi || j<=sayi) {
            if (i<=sayi && j>=sayi) {
                System.out.println("4'ün katları : " + i + ", 5'in katları : --Girilen sayıdan büyük olduğu için yazılmadı--");
                break;
            } else if (i>=sayi && j<=sayi) {
                System.out.println("4'ün katları : --Girilen sayıdan büyük olduğu için yazılmadı-- 5'in katları : "+j);
                break;
            }
            System.out.println("4'ün katları : " + i + ", 5'in katları : "+j);
            i *= 4;
            j *= 5;
        }
    }
}
