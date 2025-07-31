package BASICS;

public class String2 {
    public static void main(String[] args) {
        //cancatenation
        String n1= "Harshit";
        String n2= "Agrahari";
        String fullname= n1 +" "+ n2;
        System.out.println(fullname);
        System.out.println(fullname.length());//for length
        //charAt for character return
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
        //campare 2 string length
        if(n1.compareTo(n2) == 0){
            System.out.println(" Strings are Equal");
            
        } else {
            System.out.println("Strings are Not Equal");
            //we can also use = but always gives right answer in many cases
        }
        //write substrings
        String n3= fullname.substring(0,9 );
        System.out.println(n3);

    }
}
//Strings are immutable; cannt be changed