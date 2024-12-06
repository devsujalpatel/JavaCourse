import java.util.*;


public class Conditions {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age > 28){
        //     System.out.println("You are a adult");
        // } 
        // else{
        //     System.out.println("You are a child you can't learn java");
        // }

        // int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("Even number");
        // } else {
        //     System.out.println("Odd number");
        // }
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a == b){
        //     System.out.println("Equal");
        // } else if (a > b) {
        //         System.out.println("a is greater"); 
        // } else {
        //     System.out.println("a is lesser");
        // }

        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }

       
    }   
}