import java.util.Scanner;

/**
 * Created by Natasha on 4/18/2016.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double p=0,ne=0,z=0,temp = 0;
        String []s = scan.nextLine().split(" ");
        for(int i = 0;i<n;i++)
        {
            temp = Integer.parseInt(s[i]);
            if(temp > 0)
            {
                p++;
            }
            else if(temp < 0)
            {
                ne++;
            }
            else
            {
                z++;
            }
        }

        System.out.printf("%.6f",(p/n));
        System.out.println();
        System.out.printf("%.6f",(ne/n));
        System.out.println();
        System.out.printf("%.6f",(z/n));


    }
}
