/**
 * Problem ID    : 11461                                  
 * Problem Name  : Square Numbers                  
 * Problem URL   : https://uva.onlinejudge.org/external/114/p11461.pdf
 * Run Time	     : 0.210
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/



import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long a = cin.nextLong();
            long b = cin.nextLong();            
            if (a == 0 && b == 0)
                break;
            System.out.println(getTotalSquare(a, b));
        } 
    }
    public static long getTotalSquare(long a, long b) {
        double sqrt = 0;
        long total = 0; 
        for(long i = a; i <=b; ++i)
        {
            sqrt = Math.sqrt(i);                
            if (sqrt % 1 == 0)
                ++total;
        }
       return total; 
    } 
}