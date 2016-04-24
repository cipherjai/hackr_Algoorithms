import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 *
 31 8 2004
 20 1 2004
 * Created by Natasha on 4/22/2016.
 */
public class LibraryFine {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String []ret = scan.nextLine().split(" ");
        String []exp = scan.nextLine().split(" ");
        int fine = 0;

        if((Integer.parseInt(ret[0]) > Integer.parseInt(exp[0])) && (Integer.parseInt(ret[1]) == Integer.parseInt(exp[1])) && (Integer.parseInt(ret[1]) == Integer.parseInt(exp[1])))
        {
            fine =  ((Integer.parseInt(ret[0]))-(Integer.parseInt(exp[0])))*15;
        }
        else if((Integer.parseInt(ret[1]) > Integer.parseInt(exp[1])) && (Integer.parseInt(ret[2]) == Integer.parseInt(exp[2])))
        {
            fine =  ((Integer.parseInt(ret[1]))-(Integer.parseInt(exp[1])))*500;
        }
        else if(Integer.parseInt(ret[2]) > Integer.parseInt(exp[2]))
        {
            fine =  10000;
        }
        else
        {
            fine = 0;
        }
        //Calender now  = new GregorianCalendar(TimeZone.getDefault());

        System.out.println(fine);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
