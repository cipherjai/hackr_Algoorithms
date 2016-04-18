import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0;i<t;i++)
        {

            String [] s = scan.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            String [] ai = scan.nextLine().split(" ");
            int flag = 0;
            for(int j= 0;j<n;j++)
            {
                int temp = Integer.parseInt(ai[j]);
                if(temp <= 0)
                {
                    flag++;
                }
            }
            if(flag >= k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }

        }
    }
}
