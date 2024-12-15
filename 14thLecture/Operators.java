public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        // int c = a + b;
        // System.out.println(c);
        // int d = a - b;
        // System.out.println(d);
        // int e = a * b;
        // System.out.println(e);
        // int f = a / b;
        // System.out.println(f);
        // int g = a % b;
        // System.out.println(g);
        // // unary operators
        // int h = a++;
        // System.out.println(h);
        // int i = a--;
        // System.out.println(i);
        // int j = ++a;
        // System.out.println(j);
        // int k = --a;
        // System.out.println(k);
        // rational operators
        
        // logical operators
        if (a > b && a < b) {
            System.out.println("a is greater than b");
        } else  if (a > b || a < b) {
            System.out.println("a is not greater than b");
        } else if(a != b) {
            System.out.println("a is not equal to b");
        } else{
            System.out.println("Invalid");
        }
    }
}