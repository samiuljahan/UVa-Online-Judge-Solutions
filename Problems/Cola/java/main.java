/**
 * Problem ID    : 11150                                 
 * Problem Name  : Cola                  
 * Problem URL   : https://uva.onlinejudge.org/external/111/p11150.pdf
 * Run Time	     : 0.090
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/


import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {          
            int n = cin.nextInt();

            int a[] = numberOfCola(n, 0);
            int b[] = numberOfCola(n+1, 1);
            int c[] = numberOfCola(n+2, 2);

            int maxEat = a[1];

            if (b[1] > maxEat)
                maxEat = b[1];
           
            if (c[1] > maxEat && c[0] >= 2)
                maxEat = c[1];

            System.out.println(maxEat);
        } 
              
    }
    
    public static int[] numberOfCola(int n, int incr)
    {
        int number = 0;
        int a[] = new int[2];        

        while(n-3 >= 0)
        {
            n -= 2;
            number += 3;
        }
        if (incr == 0)
            number += n;

        a[0] = n;
        a[1] = number; 

        return a;
    }
}