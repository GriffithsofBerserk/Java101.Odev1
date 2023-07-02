import java.util.Scanner;

public class SayiSiralamaIfElse {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz : ");
        a = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        b = input.nextInt();
        System.out.println("Üçüncü Sayıyı Giriniz : ");
        c = input.nextInt();
        if (a>b && a>c){
            System.out.println("En büyük sayı : " + a);
            if (b>c){
                System.out.println("En büyük ikinci sayı : " + b);
                System.out.println("En küçük sayı : " + c);
            }else if(c>b){
                System.out.println("En büyük ikinci sayı : "+ c);
                System.out.println("En küçük sayı : "+ b);
            }
        }else if (b>a && b>c){
            System.out.println("En büyük sayı : " + b);
            if (a>c){
                System.out.println("En büyük ikinci sayı : " + a);
                System.out.println("En küçük sayı : " + c);
            }else if (c>a){
                System.out.println("En büyük ikinci sayı : "+ c);
                System.out.println("En küçük sayı : "+ a);
            }
        }else if (c>a && c>b){
            System.out.println("En büyük sayı : " + c);
            if (a>b){
                System.out.println("En büyük ikinci sayı : " + a);
                System.out.println("En küçük sayı : " + b);
            }else if (b>a){
                System.out.println("En büyük ikinci sayı : " + b);
                System.out.println("En küçük sayı : " + a);
            }
        }
        if(a==b && a==c){
            System.out.println("Bütün sayılar birbirine eşit");
        }else if (a==b){
            System.out.println(a + " ile " + b +" birbirine eşit");
            if (c>a){
                System.out.println("En büyük sayı : " + c);
            }else{
                System.out.println("En küçük sayı : " + c);
            }
        }else if (b==c){
            System.out.println(b + " ile " + c + " birbirine eşit");
            if (a>b){
                System.out.println("En büyük sayı : " + a);
            }else{
                System.out.println("En küçük sayı : " + a);
            }
        }else if(a==c){
            System.out.println(a + " ile " + c + " birbirine eşit");
            if(b>a){
                System.out.println("En büyük sayı : " +b);
            }else{
                System.out.println("En küçük sayı : "+b);
            }
        }
    }
}