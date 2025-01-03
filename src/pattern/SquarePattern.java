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
            char ch = 'A';
            for (int j=1;j<=n; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");
        int num =1;
        n=3;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }

        System.out.println("----------------------------------------------");

    }
}
