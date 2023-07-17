package Java101OOP;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi : " + Arrays.toString(list));

        System.out.print("Girilen Sayı : ");
        int inp = input.nextInt();
        int minc = inp;
        int maxc = inp;
        Arrays.sort(list);
        for(int item: list){
            if(item > inp){
                maxc = item;
                break;
            }}
        for(int i = list.length-1; i >= 0; --i){
            if(list[i] < inp){
                minc = list[i];
                break;
            }}
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minc);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxc);

    }
        }


