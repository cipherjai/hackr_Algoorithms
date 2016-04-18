import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        /*Given a square matrix of size N×NN×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, NN. The next NN lines denote the matrix's rows, with each line containing NN space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer. */

        int nn = Integer.parseInt(scan.nextLine());
        int [][] m = new int[nn][nn];
        int d1=0,d2=0, counter = nn-1, flag = 0;
        for(int i = 0;i<nn;i++)
        {

            String []s = scan.nextLine().split(" ");
            for(int j = 0;j<nn;j++)
            {
                m[i][j] = Integer.parseInt(s[j]);
                if(i == j)
                {
                    d1 += m[i][j];
                    if(i+j == nn-1)
                    {
                        d2 += m[i][j];
                    }
                }
                else if(i+j == nn-1)
                {
                    d2 += m[i][j];
                }
            }
        }/*
        for(int i = 0;i<nn;i++)
        {
            for(int j = 0; j< nn; j++)
            {
                if(i == flag && j == counter)
                {
                    d2 += m[i][j];
                    counter++;
                    flag --;

                }
                else if(i+j == nn-1)
                {

                }
                    continue;
            }
        } */
        System.out.println(Math.abs(d1-d2));

    }
}
