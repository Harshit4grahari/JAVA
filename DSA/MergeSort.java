/*Merge Sort is a Divide and Conquer sorting algorithm.
It:
1.Divides the array into two halves.
2Sorts each half recursively.
3.Merges the sorted halves. */
/*Algorithm Steps
1.Divide → Split the array into two halves (midpoint).
2.Conquer → Recursively sort both halves.
3.Combine → Merge the sorted halves back together. */
package DSA;

public class MergeSort {

    // Merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main recursive function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Avoids overflow
            mergeSort(arr, left, mid);   // Sort first half
            mergeSort(arr, mid + 1, right); // Sort second half
            merge(arr, left, mid, right); // Merge sorted halves
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array:");
        for (int num : arr)
            System.out.print(num + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}

/*Time Complexity
Best case: 𝑂(𝑛log𝑛)
Average case: O(nlogn)
Worst case:O(nlogn)
Space complexity: O(n) (extra space for merging) */