/**
 * Problem ID    : 11417                                  
 * Problem Name  : GCD                  
 * Problem URL   : https://uva.onlinejudge.org/external/114/11417.pdf
 * Run Time	     : 1.520
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/



import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in);        
        while (cin.hasNext()) {                     
            int n = cin.nextInt();
            if (n == 0)
                break; 
            int i, j = 1;
            int g = 0;
            for (i = 1;  i < n; ++i)
                for (j = i + 1;  j <= n; ++j) 
                    g += getGcd(i, j);            
            System.out.println(g);
        } 
    }
    public static int getGcd(int i, int j) {
        int gcd = 0;
        int small = 0;
        int l = 1;
       
        if (i < j)
            small = i; 
        else
            small = j;  
        
        while (l <= small) {           
            if ((i % l  == 0) && (j % l == 0)) 
                if (gcd < l) 
                    gcd = l;
            ++l;
        }           
        return gcd; 
    } 
}