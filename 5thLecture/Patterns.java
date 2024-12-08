public class Patterns {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Solid Rectangle using nested loops
        int n = 4;
        int m = 5;
        // for (int i = 1; i <= n; i++){
        // for(int j = 1; j <= m; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Hollow Rectangle pattern Print
        // for(int i = 1; i <= n; i++){
        // for(int j = 1; j <=m; j++){
        // if(i == 1 || j == 1 || i == n || j == m){
        // System.out.print("*");
        // } else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Half Pyramid pattern print

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid
        // for(int i = n; i >= 1; i--){
        //     for (int j = 1; j <= i; j++){
        //                 System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Inverted Half Pyramid rotated by 180 deg
        // for(int i = 1; i <=n; i++){
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Half Pyramid with numbers

        // for(int i = 1; i<=m; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j +" ");
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid with numbers

        // for(int i=m; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // Floyd's Triangle
        // int number = 1;
        // for(int i = 1; i<=m; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // 0-1 Triangle

        for(int i = 1; i<=m; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1);
                } else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}