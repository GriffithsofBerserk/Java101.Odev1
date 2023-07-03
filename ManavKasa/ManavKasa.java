import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        double a,b,c,d,e,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut = 2.14\nElma = 3.67\nDomates = 1.11\nMuz = 0.95\nPatlıcan = 5\n----FİYATLAR YUKARIDAKİ GİBİDİR----");
        System.out.println("Armut kaç kilo ? ");
        a = input.nextDouble();
        System.out.println("Elma kaç kilo ? ");
        b = input.nextDouble();
        System.out.println("Domates kaç kilo ? ");
        c = input.nextDouble();
        System.out.println("Muz kaç kilo ? ");
        d = input.nextDouble();
        System.out.println("Patlıcan kaç kilo ? ");
        e = input.nextDouble();
        toplam += (a*armut)+(b*elma)+(c*domates)+(d*muz)+(e*patlican);
        System.out.println("Toplam tutar : " + toplam + " TL ");
    }
}
