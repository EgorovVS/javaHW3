package HW3;
//(Дополнительное) Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 2, 1, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(insertionSort(array)));

    }

    public static int[] insertionSort(int[] arrayA) {
//        if (arrayA == null) return null;
//        if (arrayA.length <= 1) return arrayA;
//        int[] arrayB = new int[arrayA.length/2];
//        int[] arrayC = new int[arrayA.length-arrayA.length/2];
//        System.arraycopy(arrayA,0,arrayB,0,arrayA.length/2);
//        System.arraycopy(arrayA,arrayA.length/2,arrayC,0,arrayA.length);
//        arrayB = insertionSort(arrayB);
//        arrayC = insertionSort(arrayC);
//        return merge(arrayB, arrayC); не работает ((

        if(arrayA == null) return null;
        if (arrayA.length <= 1) return arrayA;
        int[] arrayB = Arrays.copyOfRange(arrayA, 0, arrayA.length / 2);
        int[] arrayC = Arrays.copyOfRange(arrayA, arrayB.length, arrayA.length);
        return merge(insertionSort(arrayB), insertionSort(arrayC));
    }

    public static int[] merge(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0;
        int positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA < arrayA.length && positionB < arrayB.length) {
                if (arrayA[positionA] < arrayB[positionB]) {
                    arrayC[i] = arrayA[positionA];
                    positionA++;
                } else {
                    arrayC[i] = arrayB[positionB];
                    positionB++;
                }
            } else if (positionA == arrayA.length && positionB < arrayB.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionA < arrayA.length && positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = 0;
            }
        }
        return arrayC;
    }
}
