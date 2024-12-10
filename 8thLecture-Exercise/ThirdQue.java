import java.util.Scanner;

public class ThirdQue {

    public static void checkGreater(int a, int b){
        if(a > b){
            System.out.println("a is greater than b");
        } else if(a == b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        checkGreater(n,b);
    }
}