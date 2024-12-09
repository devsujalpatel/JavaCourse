import java.util.Scanner;

public class Function{

    // public static void printMyName(String name){
    //     System.out.print(name);
    //     return;
    // }
    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }
    // public static int calculateProduct(int a, int b){
    //     return a * b;
    // }

    public static void calculateFactorial(int n){
        int factorial = 1;
        if(n<1){
            System.out.println("Invalid Number");
            return;
        }

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }   
        System.err.println("The Factorial of the number "+n+" is:"+factorial);
        return;
    }
    

    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // int sum = calculateSum(a, b);
        // System.out.println("Sum of Two Numbers: " + sum);
        // printMyName(name);
        // System.out.println("Product of Two Numbers: " + calculateProduct(a, b));
        int n = sc.nextInt();
        calculateFactorial(n);
    
    }
}