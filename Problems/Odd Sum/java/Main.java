/**
 * Problem ID    : 10783                                  
 * Problem Name  : Odd Sum                  
 * Problem URL   : https://uva.onlinejudge.org/external/107/p10783.pdf
 * Run Time	     : 0.070
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/



import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in);        
        while (cin.hasNext()) {                     
            int tests = cin.nextInt();
            int k = 1;
            while (k <= tests) {
                int a = cin.nextInt();
                int b = cin.nextInt();                
                System.out.println("Case " + k + ": " + getSumOfOdds(a, b));
                ++k;  
            }
        }
        cin.close();
    }
    private static int getSumOfOdds(int a, int b) {
        int total = 0;
        int i = a;
        int temp = 0;
        if (a > b) {
            temp = b;
            b = a;
            a = temp;          
        }
        while (i <= b) {
            if (i % 2 == 0) 
                ++i;
            total += i;           
            i += 2;
        }            
        return total; 
    } 
}