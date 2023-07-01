import java.util.Scanner;

public class KullaniciAdi {
    public static void main(String[] args) {
        String userName,password,y,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        password = input.nextLine();
        if(userName.equals("deneme") && (password.equals("deneme123"))){
            System.out.println("Giriş Yaptınız! ");
        } else {
            System.out.println("Şifrenizi sıfırlamak ister misiniz ?\ny\nn");
            y = input.nextLine();
            if (y.equals("y")){
                System.out.println("Lütfen yeni şifrenizi eski şifrenizden farklı giriniz!");
                password = input.nextLine();
                if (password.equals("deneme123")){
                    System.out.println("Şifre oluşturulamadı. Lütfen başka bir şifre giriniz!");
                }else{
                    System.out.println("Şifre oluşturuldu!");
                }
            }else if (y.equals("n")){
                System.out.println("Tekrar Deneyin.");
            }
        }
    }
}
