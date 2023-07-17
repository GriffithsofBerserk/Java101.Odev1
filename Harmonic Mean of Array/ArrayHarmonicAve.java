package Java101OOP;

public class ArrayHarmonicAve {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        double sum = 0;
        for (double i: array){
            sum += 1 / i;

        //for (int i = 0;i<array.length;i++){
          //  sum += array[i];
        }
        System.out.println("Harmonik Ortalama : " + array.length/sum);
    }
}
