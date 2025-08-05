//The final keyword is a non-access modifier used to restrict modification. It can be applied to:
//Variables – cannot be reassigned
//Methods – cannot be overridden
//Classes – cannot be inherited

package OOPS;
//final Variable (Constant)
public class FinalKeyword {
    public static void main(String[] args) {
        final int speedLimit = 80;
        // speedLimit = 100; // ❌ Error: can't assign a value to final variable
        System.out.println("Speed limit is: " + speedLimit);
    }
}

