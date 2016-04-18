import java.util.Scanner;

/**
 * Created by Natasha on 4/18/2016.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String s = scan.nextLine();
        char check = s.charAt(8);
        String temp2 = s.substring(0,2);
        String temp = s.substring(2,8);
        int temp3 = Integer.parseInt(temp2);
        if(check == 'P')
        {
            if(temp3 == 12)
            {
                System.out.println(temp3 + temp);
            }
            else {
                System.out.println((temp3 + 12) + temp);
            }
        }
        else
        {

            if(temp3 == 12)
            {
                //System.out.print("00");
                System.out.println("00"+temp);

            }
            else
            {
                System.out.println(temp2+temp);
            }

        }

    }
}
