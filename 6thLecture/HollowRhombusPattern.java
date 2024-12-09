public class HollowRhombusPattern {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(j=1; j<=n; j++){
                    System.out.print("*");
                }
            } else{
                for(j=1; j<=n; j++){
                    if(j==1 || j==n){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }


    }
}
