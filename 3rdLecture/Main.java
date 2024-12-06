import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 28){
            System.out.println("You are a adult");
        } 
        else{
            System.out.println("You are a child you can't learn java");
        }
    }   
}