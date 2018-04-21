/**
 * Problem ID    : 10370                                  
 * Problem Name  : Above Average                  
 * Problem URL   : https://uva.onlinejudge.org/external/103/10370.pdf
 * Run Time	     : 0.180
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/




import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in);        
        while (cin.hasNext()) {                     
            int c = cin.nextInt();
            int k = 1; 
            while (k <= c) {
                int m = 1;
                int [] N = new int [1000];
                double n = cin.nextDouble();
                double avg = 0.0;
                int t = 0; 
                while (m <= n) {
                    int number = cin.nextInt();
                    t += number;
                    N[m-1] = number;
                    ++m;  
                }
                avg = t / n;  
                double count = 0;
                for (int  l = (int) (n - 1); l >= 0; --l) {
                    if (N[l] > avg)
                       ++count; 
                }
                System.out.printf("%.3f", (count / n) * 100);
                System.out.print("%");
                System.out.println("");
                ++k;  
            }
        }
        cin.close();
    }
}