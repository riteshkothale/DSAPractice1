package pattern;

public class ButterFlyPattern {

    public static void main(String[] args) {

        int n = 4;

        //top
        for (int i=0; i<n; i++){

            //star - i+1
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            //space - n-i-1
            for (int j=1; j<=n-i-1; j++){
                System.out.print("-");
            }

            //Space2 - n-i-1
            for (int j=1; j<=n-i-1; j++){
                System.out.print("-");
            }

            //star 2 - 0 to i
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
