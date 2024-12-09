public class Patterns {
    public static void main(String[] args) {
        //Butterfly Pattern
        int n = 4;
        int i, j;
        for(i = 1; i<=n; i++){
            // upper half
            // first part
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2 * (n-i);
            for(j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // second part
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = n; i>=1; i--){
            // Lower half
            // first part
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2 * (n-i);
            for(j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // second part
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}