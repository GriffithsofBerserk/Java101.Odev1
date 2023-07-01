package DaireAlanCevre;

import java.util.Scanner;
import java.lang.Math;

public class DaireAC {
    public static void main(String[] args) {
        double r,alfa;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        r = input.nextDouble();
        System.out.println("Alanını bulmak istediğiniz açının ölçüsünü giriniz. : ");
        alfa = input.nextDouble();
        double alan = Math.PI*r*r;
        double cevre = Math.PI*2*r;
        double dilim = (Math.PI*(r*r)*alfa)/360;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Daire Diliminin Alanı : " + dilim);

    }
}
