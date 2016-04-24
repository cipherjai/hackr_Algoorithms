import java.util.Scanner;

/**
 * Created by Natasha on 4/24/2016.
 * ∑i=0Ni=N×(N+1)2
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int t = Integer.parseInt(scan.nextLine());
        int spring = 0;
        int summer = 1;
        int height = 1;
        for(int i = 0;i<t;i++)
        {
            int n  = Integer.parseInt(scan.nextLine());
            for(int j = 0;j<=n;j++)
            {
                spring = 2*j;
                summer ++;
            }
            height = 1+summer+spring;
            System.out.println(height);
        }
    }
}
