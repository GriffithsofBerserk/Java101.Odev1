import java.util.Scanner;

public class FibonacciDoWhile {
    public static void main(String[] args) {
        int eleman,b=1,sum=0,a=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz : ");
        eleman = input.nextInt();
        do{
            a++;
            a=b;
            b=sum;
            sum=a+b;
            System.out.println(a+"+"+b+"="+sum);
        }while (a<=eleman);
    }
}
