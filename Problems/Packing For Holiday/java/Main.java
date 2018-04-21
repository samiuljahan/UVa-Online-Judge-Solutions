/**
 * Problem ID    : 12372                                  
 * Problem Name  : Packing for Holiday                  
 * Problem URL   : https://uva.onlinejudge.org/external/123/12372.pdf
 * Run Time	     : 0.080
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
                short l = cin.nextShort();
                short w = cin.nextShort();
                short h = cin.nextShort();
                
                if (l <= 20 && w <= 20 && h <=20)
                    System.out.println("Case " + (i + 1) + ":"  + " good");
                else
                    System.out.println("Case " + (i + 1) + ":" + " bad");
                ++i;
            }
        }
        cin.close();
    }
}