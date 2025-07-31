package BASICS;
import java.util.*;

public class Variables {
    public static void main(String[] args) {
        int a =10;
        int b =24;
        int sum=a+b;
        System.out.println(sum);
        int mul=a*b;
        System.out.println(mul);
        int ans=a*b/a-b;
        System.err.println(ans);
        int answ=(a*b)/(a+b);
        System.out.println(answ);//In java numericals only solve from left to right
        Scanner sc = new Scanner(System.in);//function to allow take input
        int c = sc.nextInt();// to take input
        int d = sc.nextInt();
        int add = c + d;
        System.out.println(add);
    }
}
