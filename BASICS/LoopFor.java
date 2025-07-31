package BASICS;

public class LoopFor {
    public static void main(String[] args) {
        for(int counter=0; counter < 10; counter = counter + 1){
            System.out.println("Hello World");
        }
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
        for(int i=0; i<11; i++){
            System.out.print(i+" ");
        }
    }
}
//for(initialisation;condition;updation){
// do something
// }