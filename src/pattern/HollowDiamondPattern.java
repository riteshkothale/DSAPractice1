package pattern;

public class HollowDiamondPattern {

    public static void main(String[] args) {

        int n=4;
    // top
        for (int i=0; i<n; i++){

            //space1 - o to n-i-1
            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            //space2 - 0 to 2*i-1 - to find out odd number
            if(i!=0){
                for (int j=0; j<(2*i-1); j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom

        for (int i=0; i<n-1;i++){

            //space 1 - o to i+1
            for (int j=1;j<=i+1;j++){
                System.out.print(" ");
            }
            System.out.print("*");

            //space 2 - o to (2(n-i)-5)) - to find odd number for bottom part
            if (i!=n-2) {
                for (int j = 1; j <= (2* (n - i) - 5); j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
