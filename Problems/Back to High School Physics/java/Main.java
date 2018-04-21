/**
 * Problem ID    : 10071                                  
 * Problem Name  : Back to High School Physics                  
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
            short v = cin.nextShort();
            short t = cin.nextShort();
            System.out.println(v*t*2);
        }
        cin.close();
    }
}