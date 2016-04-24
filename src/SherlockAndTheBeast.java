import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/*public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //int trunk = 0;
        int t = Integer.parseInt(scan.nextLine());
        ArrayList<Long> arr = new ArrayList<Long>();
        for (int i = 0; i < t; i++) {
            int c3 = 0;
            int c5 = 0;
            int n = Integer.parseInt(scan.nextLine());
            if (n <= 2) {
                System.out.println("-1");
            } else {

                long kotlin = 10^n;

                for (long j = 555; j < kotlin; j++) {
                    //ArrayList<Integer> obj  = new ArrayList<Integer>();
                    //ArrayList <String> arr = new ArrayList<String>();
                    Long temp = j;
                    while (temp != 0) {
                        long check = temp % 10;
                        temp = temp / 10;
                        if (check == 3 || check == 5) {
                            if (check == 3) {
                                c3++;
                            } else {
                                c5++;
                            }
                        }

                    }
                    if (c3 % 5 == 0 || c5 % 3 == 0) {
                        arr.add(j);

                    }


                }

                //Arrays.sort(arr);
                System.out.println(arr.get(arr.size() - 1));
            }

            arr.clear();

        }
    }
} */
public class SherlockAndTheBeast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while((t--)>0){
            int n = in.nextInt();
            StringBuffer answer = new StringBuffer();
            for(int j = 0;j <= n/5;j++){
                //System.out.println("J="+j+" N/5="+(n/5));
                //System.out.println("(n-5*j) = "+(n-5*j));
                if((n-5*j)%3 == 0){
                    for(int k = 0;k< n-5*j;k++)
                        answer.append("5");
                    for(int k = 0;k < 5*j;k++)
                        answer.append("3");
                    System.out.println(answer.toString());
                    break;
                }
            }
            if(answer.toString().equals(""))
                System.out.println(-1);
        }
    }
}