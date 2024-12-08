import java.util.*;;


public class Loops {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
    // for loop
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }
    // while loop
        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(5*i);
        //     i++;
        // }
    // do while loop
    // int i = 5;
    // do{
    //     System.out.println(5*i);
    //     i++;
    // } while(i < 5);

    // Q1: Print the sum of First n natural numbers
        // int sum = 0;
        // int n = 4;
        // for (int i = 1; i <= n; i++ ){
        //     sum += i;
        // }
        // System.out.println(sum);

    // Q2: Print the sum of First n even natural numbers
        // int evenSum = 0;
        // int nat = 10;
        // for (int i = 2; i <= nat; i += 2){
        //     evenSum += i;
        // }
        // System.out.println(evenSum);
        // Print the table of a number input by the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
