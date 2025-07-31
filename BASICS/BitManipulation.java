package BASICS;

public class BitManipulation {
    public static void main(String[] args) {
        
    
    int x = 5;  // Binary: 0101
        int pos = 1;

        System.out.println("Initial number: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");

        // 1. Get Bit at Position
        int bitMask = 1 << pos;
        if ((x & bitMask) != 0) {
            System.out.println("Bit at position " + pos + " is 1");
        } else {
            System.out.println("Bit at position " + pos + " is 0");
        }

        // 2. Set Bit at Position
        int newNumber = x | bitMask;
        System.out.println("After setting bit at position " + pos + ": " + newNumber + " (Binary: " + Integer.toBinaryString(newNumber) + ")");

        // 3. Clear Bit at Position
        int clearMask = ~(1 << pos);
        newNumber = x & clearMask;
        System.out.println("After clearing bit at position " + pos + ": " + newNumber + " (Binary: " + Integer.toBinaryString(newNumber) + ")");

        // 4. Toggle Bit at Position
        newNumber = x ^ bitMask;
        System.out.println("After toggling bit at position " + pos + ": " + newNumber + " (Binary: " + Integer.toBinaryString(newNumber) + ")");

        // 5. Update Bit at Position (e.g., update to 1 or 0)
        int valueToUpdate = 1;  // can be 0 or 1
        int updateMask = ~(1 << pos);       // Clear the bit
        int updatedBit = (x & updateMask) | (valueToUpdate << pos);  // Set to desired value
        System.out.println("After updating bit at position " + pos + " to " + valueToUpdate + ": " +
                           updatedBit + " (Binary: " + Integer.toBinaryString(updatedBit) + ")");

        // 6. Count Set Bits
        int count = Integer.bitCount(x);
        System.out.println("Number of set bits in " + x + ": " + count);

        // 7. Check if a number is power of 2
        int num = 16;
        boolean isPowerOfTwo = (num & (num - 1)) == 0;
        System.out.println(num + " is power of 2: " + isPowerOfTwo);

        // 8. Multiply by 2 using left shift
        int mulBy2 = x << 1;
        System.out.println(x + " * 2 = " + mulBy2);

        // 9. Divide by 2 using right shift
        int divBy2 = x >> 1;
        System.out.println(x + " / 2 = " + divBy2);
    }
}
