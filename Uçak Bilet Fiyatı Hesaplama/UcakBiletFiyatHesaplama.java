import java.util.Scanner;

public class UcakBiletFiyatHesaplama {
    public static void main(String[] args) {
        double mesafe,mbucret=0.1,oniki=0.5,onkiyrmdrt=0.1,altmisbes=0.3,ytipiki=0.2;
        int yas, ytipi;
        boolean hata = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextDouble();
        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz\n1 => Tek Yön\n2 => Gidiş-Dönüş");
        ytipi = input.nextInt();
        double ntutar = mesafe*mbucret;
        if (mesafe>0 && yas>0){
            if (ytipi==1 || ytipi ==2){
                if(ytipi==1){
                    if (yas<12){
                        double yindirim = ntutar*oniki;
                        double indtutar = ntutar-yindirim;
                        System.out.println("Normal Tutar : "+indtutar+" TL ");
                    }
                    if (yas>=12 && yas<=24){
                        double yindirim = ntutar*onkiyrmdrt;
                        double indtutar = ntutar-yindirim;
                        System.out.println("Normal Tutar : "+indtutar+" TL ");
                    }
                    if(yas>=65){
                        double yindirim = ntutar*altmisbes;
                        double indtutar = ntutar-yindirim;
                        System.out.println("Normal Tutar : "+indtutar+" TL ");
                    }
                    if (yas>24 && yas<65){
                        System.out.println("Normal Tutar : "+ntutar+" TL ");
                }
                }
                if (ytipi==2){
                    if (yas<12){
                        double yindirim = ntutar*oniki;
                        double indtutar = ntutar-yindirim;
                        double gdind = indtutar*ytipiki;
                        double ttutar = (indtutar-gdind)*2;
                        System.out.println("Normal Tutar : "+ttutar+" TL ");
                    }
                    if (yas>=12 && yas<=24){
                        double yindirim = ntutar*onkiyrmdrt;
                        double indtutar = ntutar-yindirim;
                        double gdind = indtutar*ytipiki;
                        double ttutar = (indtutar-gdind)*2;
                        System.out.println("Normal Tutar : "+ttutar+" TL ");
                    }
                    if(yas>=65){
                        double yindirim = ntutar*altmisbes;
                        double indtutar = ntutar-yindirim;
                        double gdind = indtutar*ytipiki;
                        double ttutar = (indtutar-gdind)*2;
                        System.out.println("Normal Tutar : "+ttutar+" TL ");
                    }
                    if(yas>24 && yas<65){
                        double gdind = ntutar*ytipiki;
                        double ttutar = (ntutar-gdind)*2;
                        System.out.println("Normal Tutar : "+ttutar+" TL ");
                }
                }
            }else{
                hata = true;
            }
        }else{
            hata = true;
        }
        if(hata){
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
