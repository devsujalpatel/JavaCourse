import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // int marks[] = {95, 90, 85};
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }
    }
}