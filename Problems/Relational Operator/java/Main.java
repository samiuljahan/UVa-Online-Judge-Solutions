/**
 * Problem ID    : 11172                                  
 * Problem Name  : Relational Operator                  
 * Problem URL   : https://uva.onlinejudge.org/external/111/p11172.pdf
 * Run Time	     : 0.120
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/



import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        while (cin.hasNext()) {            
            short num = cin.nextShort();
            short i = 0;
            while(i < num)
            {
                long a = cin.nextLong();
                long b = cin.nextLong();                
                
                if (a < b)
                    System.out.println("<");
                else if (a > b)
                    System.out.println(">");
                else
                System.out.println("=");

                ++i;
            }
        }
        cin.close();
    }
}