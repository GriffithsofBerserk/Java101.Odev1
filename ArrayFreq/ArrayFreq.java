package Java101OOP;
import java.util.Arrays;
public class ArrayFreq {
    public static void main(String[] args) {
        int[] dizi = {10,20,20,10,10,20,5,20};
        int sum = 1;
        System.out.println("Dizi : " + Arrays.toString(dizi));
        Arrays.sort(dizi);
        System.out.println("Tekrar Sayıları");
        for (int i = 0;i<dizi.length;i++){
            if (i==0) {
                for (int j = 0; j < dizi.length; j++) {
                    if (i != j && dizi[i] == dizi[j]) {
                        sum += 1;
                    }
                }
                System.out.println(dizi[i] + " sayısı " + sum + " kez tekrar edildi");
            }else if (dizi[i] != dizi[i-1]) {
                for (int j = 0; j < dizi.length; j++) {
                    if ((i != j) && (dizi[i] == dizi[j])) {
                        sum += 1;
                    }
                }
                System.out.println(dizi[i] + " sayısı " + sum + " kere tekrar edildi.");
            }
            sum = 1;
        }

    }
}
