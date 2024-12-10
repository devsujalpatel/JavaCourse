import java.util.Scanner;

public class FifthQue {

    public static void checkEligibleToVote(int age) {
        if(age < 18){
            System.out.println("You are not eligible to vote");
        } else if(age < 0){
            System.out.println("Invalid age");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        checkEligibleToVote(age);
    }
}
