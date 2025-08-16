/*Binary Search is an efficient searching algorithm that works on sorted arrays.
It uses the divide and conquer technique to find an element by repeatedly halving the search range.

How It Works
1.Start with low = 0 and high = last index.
2.Find the mid index → mid=(low+high)/2.
3.Compare:
>If arr[mid] == key → found.
>If arr[mid] > key → search left half.
>If arr[mid] < key → search right half.
4.Repeat until found or range becomes empty.*/
package DSA;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids overflow

            if (arr[mid] == key)
                return mid; // Found
            if (arr[mid] < key)
                low = mid + 1; // Search right
            else
                high = mid - 1; // Search left
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
    public class BinarySearchRecursive {

    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                return binarySearch(arr, low, mid - 1, key);
            else
                return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 6;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}

}
