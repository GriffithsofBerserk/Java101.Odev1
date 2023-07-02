import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        int ay,gun;
        String burc = "";
        boolean hata = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz : \n1-Ocak\n2-Şubat" +
                "\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos" +
                "\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
        ay = input.nextInt();
        System.out.println("Doğduğunuz günü giriniz : ");
        gun = input.nextInt();
        if (ay>=1 && ay<=12) {
            if (ay == 1) {
                if (gun>=1 && gun<=31){
                    if (gun < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 2) {
                if (gun >=1 && gun <= 29){
                    if (gun < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 3) {
                if (gun >=1 && gun <= 31){
                    if (gun < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 4) {
                if (gun >=1 && gun <= 30){
                    if (gun < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 5) {
                if (gun >=1 && gun <= 31){
                    if (gun < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 6) {
                if (gun >=1 && gun <= 30){
                    if (gun < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 7) {
                if (gun >=1 && gun <= 31){
                    if (gun < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 8) {
                if (gun >=1 && gun <= 31){
                    if (gun < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 9) {
                if (gun >=1 && gun <= 30){
                    if (gun < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 10) {
                if (gun >=1 && gun <= 31){
                    if (gun < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 11) {
                if (gun >=1 && gun <= 30){
                    if (gun < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                }else{
                    hata = true;
                }
            }
            if (ay == 12) {
                if (gun >=1 && gun <= 31){
                    if (gun < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                }else{
                    hata = true;
                }
            }if(hata){
                System.out.println("Hatalı gün girdiniz!");
            }else{
                System.out.println("Burcunuz : " + burc);
            }

        }else{
            System.out.println("Hatalı giriş yaptınız! Lütfen doğduğunuz ayı doğru giriniz.");
        }
    }
}
