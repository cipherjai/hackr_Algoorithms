import java.util.Scanner;

/**
 * Created by Natasha on 4/16/2016.
 */
public class Simple_Array_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String [] s = scan.nextLine().split(" ");
        long temp = 0;
        for(int i = 0; i< n; i++)
        {
            temp += Integer.parseInt(s[i]);
        }
        System.out.println(temp);
    }
}
