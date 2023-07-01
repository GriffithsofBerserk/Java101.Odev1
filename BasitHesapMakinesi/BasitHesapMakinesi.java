import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        int a,b,result;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.println("Hangi işlemlerin yapılmasını istiyorsunuz ? O rakamı yazınız.\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        int islem = input.nextInt();
        switch (islem) {
            case 1:
                result = a+b;
                System.out.println(result);
                break;
            case 2:
                result = a-b;
                System.out.println(result);
                break;
            case 3:
                result = a*b;
                System.out.println(result);
                break;
            case 4:
                result = a/b;
                System.out.println(result);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. ");
        }
    }
}
