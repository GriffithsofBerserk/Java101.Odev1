import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik2 {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz : ");
        sicaklik = input.nextInt();
        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz!");
        }else if (sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz!");
        }
        if(5<sicaklik && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz!");
        }else if(15<sicaklik && sicaklik<=25){
            System.out.println("Pikniğe gidebilirsiniz!");
        }
    }
}
