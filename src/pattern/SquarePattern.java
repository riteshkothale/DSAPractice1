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

        System.out.println("-------------------------------------");

        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        for(int i=1; i<=n; i++){
            char ch = 97;
            for (int j=1;j<=n; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
