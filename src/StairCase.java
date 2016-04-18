import java.util.Scanner;

public class StairCase
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n  = Integer.parseInt(scan.nextLine());
        int i = 0;
        do {

            for (int k = 0;k<=n-2-i;k++)
            {
                System.out.printf(" ");
            }
            for (int h = 0; h <= i; h++)
            {
                System.out.printf("#");
            }
            System.out.println();
            i++;


        }while(i != n);
    }
}