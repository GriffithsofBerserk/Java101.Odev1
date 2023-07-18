package Java101OOP;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        int n,num;
        int startIndex = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 1;i<=n;i++){
            System.out.print(i+". Elemanı : ");
            num = input.nextInt();
            arr[startIndex++]=num;
        }
        Arrays.sort(arr);
        Arrays.toString(arr);
        System.out.print("Sıralama : ");
        for (int deger : arr){
            System.out.print(deger+" ");

        }

    }
}
