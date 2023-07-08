import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        int eleman,b=1,sum=0,a=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz : ");
        eleman = input.nextInt();
        while (a<=eleman){
            a++;
            a=b;
            b=sum;
            sum=a+b;
            System.out.println(a+"+"+b+"="+sum);
        }
    }
}
