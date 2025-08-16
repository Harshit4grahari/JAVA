/*Quick Sort is a Divide and Conquer sorting algorithm.
Instead of merging like Merge Sort, it picks a pivot and rearranges elements so:
>Elements smaller than pivot go to the left.
>Elements larger than pivot go to the right.
Then it recursively sorts the left and right sides. */
/*Key Steps
1.Choose a pivot (can be first, last, middle, or random element).
2.Partition the array:
>Move all smaller elements to the left of pivot.
>Move all greater elements to the right.
3.Recursively apply the same logic to left and right subarrays. */
package DSA;

public class QuickSort {

    // Partition method
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partition index
            quickSort(arr, low, pi - 1); // Sort left side
            quickSort(arr, pi + 1, high); // Sort right side
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array:");
        for (int num : arr) System.out.print(num + " ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        for (int num : arr) System.out.print(num + " ");
    }
}
/*Complexity
Best case: O(nlogn) (good pivot choice)

Average case: O(nlogn)

Worst case: O(n^2) (bad pivot every time, e.g., sorted array with last element as pivot)

Space complexity: O(logn) (recursive calls) */