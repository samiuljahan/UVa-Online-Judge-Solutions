/**
 * Problem ID    : 100                                 
 * Problem Name  : The 3n + 1 Problem                  
 * Problem URL   : http://uva.onlinejudge.org/external/1/100.html
 * Run Time	     : 0.570
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/

import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {          
            int i = cin.nextInt(), j = cin.nextInt(),  temp = 0, cycleCount = 1, maxCycle = 1;
            int n = i, p = j; 
            if (i > j) {
                temp = j;
                j = i;
                i = temp;          
            }   
            for(int m = i; m <= j; ++m)
            {
                cycleCount =  getCycleCount(m);
                if (maxCycle < cycleCount) 
                    maxCycle = cycleCount;
            }
            System.out.println (n + " " + p + " " + maxCycle);
        }
        cin.close();
    }
    private static int  getCycleCount(int n) {
        int count = 1;       
        while (n != 1) {
            if (n % 2 != 0)
                n = (3 * n) + 1;
            else
                n/=2;
            ++count;
        }
        return count;
    }
}