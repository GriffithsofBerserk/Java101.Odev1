package Java101OOP;

import java.util.Arrays;

public class ArrayRepeatNumber {
    static boolean isFind(int[] arr,int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] dizi = {5,3,2,4,6,4,6,6,9,8,8,3,5,5,5,2};
        int[] duplicate = new int[dizi.length];
        int startIndex = 0;
        for (int i = 0; i<dizi.length;i++){
            for (int j = 0; j<dizi.length;j++){
                if (i != j && dizi[i] == dizi[j]){
                    if (!isFind(duplicate,dizi[i])) {
                        duplicate[startIndex++] = dizi[i];
                    }
                    break;
                }
            }
        }
        Arrays.toString(duplicate);
        for (int k : duplicate){
            if (k != 0 && k%2==0){
                System.out.println(k);
            }
        }
    }
}
