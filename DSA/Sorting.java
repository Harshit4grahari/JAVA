package DSA;

import java.util.Arrays;

public class Sorting {

    // 1. Bubble Sort //Time complexity = o(n^2)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sorted: " + Arrays.toString(arr));
    }

    // 2. Selection Sort //Time Complexity = o(n^2)
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sorted: " + Arrays.toString(arr));
    }

    // 3. Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println("Insertion Sorted: " + Arrays.toString(arr));
    }

    // 4. Built-in Sort
    static void builtInSort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Built-in Sorted: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11};

        int[] arr1 = Arrays.copyOf(original, original.length);
        int[] arr2 = Arrays.copyOf(original, original.length);
        int[] arr3 = Arrays.copyOf(original, original.length);
        int[] arr4 = Arrays.copyOf(original, original.length);

        bubbleSort(arr1);
        selectionSort(arr2);
        insertionSort(arr3);
        builtInSort(arr4);
    }
}
