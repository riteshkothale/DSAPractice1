package pattern;

public class SquarePattern {

    public static void main(String[] args) {

        System.out.println("Print 1 to n");
        int n = 4;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
