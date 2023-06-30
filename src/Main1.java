import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //int a;
        Scanner input = new Scanner(System.in);
        //a = input.nextInt(); // a double ise nextDouble() olmalıydı. stringde ise nextLine()
        //System.out.println(a);

        int Matematik,Fizik,Kimya,Turkce,Tarih,Muzik;
        System.out.println("Matematik Notunu Giriniz : ");
        Matematik = input.nextInt();
        System.out.println("Fizik Notunu Giriniz : ");
        Fizik = input.nextInt();
        System.out.println("Kimya Notunu Giriniz : ");
        Kimya = input.nextInt();
        System.out.println("Turkce Notunu Giriniz : ");
        Turkce = input.nextInt();
        System.out.println("Tarih Notunu Giriniz : ");
        Tarih = input.nextInt();
        System.out.println("Muzik Notunu Giriniz : ");
        Muzik = input.nextInt();
        double toplam;
        double ort;
        toplam = Matematik+Fizik+Kimya+Turkce+Tarih+Muzik;
        ort = toplam/6;
        System.out.println("Ortalamanız : " + ort);
        boolean kosul = ort >= 60;
        String str = kosul ? "Sınıfı Geçtiniz!" : "Sınfta Kaldınız!";
        System.out.println(str);
    }
}
