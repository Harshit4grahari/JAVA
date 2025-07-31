package BASICS;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        // Declaration
        //String nam = "Harshit";
       // String fullName = "Harshit Agrahari";
        String dialogue = "Say My Name.";

        System.out.println(dialogue);
        //Input
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        System.out.println(" Your name is : "+ name);
    }
}
