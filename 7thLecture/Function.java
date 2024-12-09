import java.util.Scanner;

public class Function{

    // public static void printMyName(String name){
    //     System.out.print(name);
    //     return;
    // }
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    

    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = calculateSum(a, b);
        System.out.println("Sum of Two Numbers: " + sum);
        // printMyName(name);
    }
}