import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int Mat,Fizik,Turkce,Kimya,Muzik,sayi=5;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz : ");
        Mat = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz : ");
        Fizik = input.nextInt();
        System.out.println("Turkce Notunuzu Giriniz : ");
        Turkce = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz : ");
        Kimya = input.nextInt();
        System.out.println("Muzik Notunuzu Giriniz : ");
        Muzik = input.nextInt();
        if (Mat<0 || Mat>100){
            Mat=0;
            sayi -=1;
        }
        if (Fizik<0 || Fizik>100){
            Fizik=0;
            sayi -=1;
        }
        if (Turkce<0 || Turkce>100){
            Turkce=0;
            sayi -=1;
        }
        if (Kimya<0 || Kimya>100){
            Kimya=0;
            sayi -=1;
        }
        if (Muzik<0 || Muzik>100){
            Muzik=0;
            sayi -=1;
        }
        double ort = (Mat+Fizik+Turkce+Kimya+Muzik)/sayi;
        if (ort>=55){
            System.out.println("Sınıfı Geçtiniz!!");
        }else{
            System.out.println("Kaldınız...");
        }
        System.out.println("Ortalamanız :" + ort);
    }
}
