import java.util.Scanner;

public class ForthQue {
    
    public static void circumference(int r){
        double c = 2*3.14*r;
        System.out.println("Circumference of circle is "+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circumference(r);
    }
}
