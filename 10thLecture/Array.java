import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // int marks[] = {95, 90, 85};
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        // output
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }
    }
}