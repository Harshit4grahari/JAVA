package DSA;

public class BinarySearch2D {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0, high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true; // Found
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        
        int key = 16;

        if (searchMatrix(matrix, key))
            System.out.println("Element " + key + " found in matrix");
        else
            System.out.println("Element " + key + " not found in matrix");
    }
}

/* Time Complexity: O(log(rows * cols))

Space Complexity: O(1)*/
