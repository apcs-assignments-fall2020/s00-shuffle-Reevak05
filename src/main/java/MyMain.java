import java.util.Arrays;
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) {

        int[] arr1 = new int[(int)((arr.length+0.5)/2)];
        int[] arr2 = new int[arr.length-arr1.length];
        int[] arrFinal = new int[arr.length];

        for (int i = 0;i<arr1.length; i++) arr1[i] = arr[i];
        int k = 0;
        for (int i = arr1.length;i<arr.length; i++) {
            arr2[k] = arr[i];
            k++;
        }

        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arrFinal[j] = arr1[i];
            j++;
            if (i<arr2.length) {
                arrFinal[j] = arr2[i];
                j++;
            }
        }
        return arrFinal;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int currentInt = arr[i];
            int randomInt = (int)(Math.random()*arr.length);
            arr[i] = arr[randomInt];
            arr[randomInt] = currentInt;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        System.out.println("original array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]");
        System.out.println("perfect shuffle: " + Arrays.toString(perfectShuffle(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15})));
        for (int i = 0; i<100; i++) System.out.println("selection shuffle: " + Arrays.toString(selectionShuffle(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15})));
    }
}
