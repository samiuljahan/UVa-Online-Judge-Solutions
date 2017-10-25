/**
 * Problem ID    : 11727                                  
 * Problem Name  : Cost Cutting                  
 * Problem URL   : https://uva.onlinejudge.org/external/117/p11727.pdf
 * Run Time	     : 0.060
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/




import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in);        
        while (cin.hasNext()) {                     
            short n = cin.nextShort();
            short i = 0;
            while (i < n) {
                short a = cin.nextShort();
                short b = cin.nextShort();
                short c = cin.nextShort();
                short max = getMax(a, b);
                short s = getMin(max, c);
                if (s < b && (b != max))
                    s = b;
                if (s < a && (a != max))
                    s = a;
                System.out.println("Case " + (i + 1) + ": " + s); 
                ++i;
            }
        }
        cin.close();
    }
    public static short getMax(short a, short b) {
        short max = 0;
        if (a > b) 
            max = a; 
        else
            max = b;
        return max;
    }
    public static short getMin(short a, short b) {
        short min = 0;
        if (a < b)
            min = a; 
        else
            min = b;
        return min;
    }
}