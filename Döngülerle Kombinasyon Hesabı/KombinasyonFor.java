import java.util.Scanner;

public class KombinasyonFor {
    public static long faktoriyel(int a){
       int total =1;
       for (int i=1;i<=a;i++){
           total *=i;
       }
       return total;
    }
    public static void main(String[] args) {
        int n,r;
        Scanner input = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz kombinasyonun tavan sayısını girin : ");
        n = input.nextInt();
        for (r=0;r<=n;r++){
            long b = faktoriyel(n) / (faktoriyel(r)*faktoriyel(n-r));
            System.out.println(n+" nın "+r+ " li kombinasyonu " + b);
        }
    }
}
