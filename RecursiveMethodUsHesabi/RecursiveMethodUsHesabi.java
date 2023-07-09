import java.util.Scanner;

public class RecursiveMethodUsHesabi {
    static void Us(int b,int c){
        int result=1;
        for (;c!=0;){
            result =result*b;
            --c;
        }
        System.out.println("Sonuç : "+result);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int b = input.nextInt();
        System.out.println("Üs değeriniz giriniz : ");
        int c = input.nextInt();
        Us(b,c);

    }
}
